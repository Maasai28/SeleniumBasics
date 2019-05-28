package com.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dougl\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		List <WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links "+links.size());
		int count=0;
		Iterator<WebElement> linksIt=links.iterator();
		while(linksIt.hasNext()) {
			String linkTest=linksIt.next().getText();
			if(!linkTest.isEmpty()) {
			System.out.println(linkTest);
			count++;
			System.out.println(count);
			}
		}
		System.out.println("Number of links with Text "+count);
		driver.quit();

	}

}
