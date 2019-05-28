package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task3 extends CommonMethods{
	/*  Task for contextClick
		 Navigate to https://www.saucedemo.com
		 Right click on the password textbox 
		 Close the browser  
	 */

	public static void main(String[] args) {
		setUpDriver("chrome","https://www.saucedemo.com" );
		WebElement rightClick= driver.findElement(By.cssSelector("input#password"));
		Actions action = new Actions(driver);
		action.contextClick(rightClick).perform();
		driver.close();
	

	}

}
