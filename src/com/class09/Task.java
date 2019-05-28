package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class Task extends CommonMethods{
	/*TC 1: Verify element is present
	Open chrome browser
	Go to “https://the-internet.herokuapp.com/”
	Click on “Click on the “Dynamic Loading” link
	Click on “Example 1...” and click on “Start”
	Verify element with text “Hello World!” is displayed
	Close the browser
	 * 
	 */

	public static void main(String[] args) {
		
		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);

		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		//wait.until(E)
		driver.close();
		
		
	}

}
