package com.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

import utils.CommonMethods;

public class HWWindows extends CommonMethods{
	/* @all TC 1: ToolsQA Windows verification
	Open chrome browser
	Go to “https://the-internet.herokuapp.com/”
	Click on “Multiple Windows” link
	Click on “Elemental Selenium”
	Verify title of second window is “Elemental Selenium: Receive a Free, Weekly Tip on Using Selenium like a Pro”
	Close second window
	Click on “Click Here” link
	Verify title if newly open window is “New Window”
	Close second window
	Verify title of second window is “The Internet”
	Quit browser
	NOTE: Selenium execution could be too fast, please use Thread.sleep
	 * 
	 */

	public static void main(String[] args) {
		setUpDriver("chrome", "https://the-internet.herokuapp.com/");
		String parent =driver.getTitle();
        String parentId= driver.getWindowHandle();
        System.out.println("title: "+parent+" "+" ID: "+parentId);
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> it = allWindows.iterator();
        parent=it.next();
        String child= it.next();
        driver.switchTo().window(child);
        child=driver.getTitle();
        driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
        boolean wind = driver.findElement(By.cssSelector("h2.subheader"));
		if(wind==true) {
			driver.switchTo().defaultContent();
			driver.close();
		

	}
  }
}
