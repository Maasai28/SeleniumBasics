package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task2 extends CommonMethods{
//	Task for hoverOver
//  Navigate to https://www.toolsqa.com
//      Hover over the Tutorial menu
//      Click on Software Testing Tutorial
//      Close the browser

	public static void main(String[] args) {
		
		setUpDriver("chrome", "https://www.toolsqa.com");
		WebElement hover = driver.findElement(By.xpath("//span[text()='Tutorial']"));
		Actions action= new Actions(driver);
		action.moveToElement(hover).click().perform();
		driver.findElement(By.xpath("//span[text()='Software Testing Tutorial']")).click();
		driver.close();
		

	}

}
