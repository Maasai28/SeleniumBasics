package com.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.CommonMethods;

public class TaskTC3 extends CommonMethods{
	/*
	 * TC 3: Verify element is enabled
	 * Open chrome browser
	 * Go to �https://the-internet.herokuapp.com/�
	 * Click on �Click on the �Dynamic Controls� link
	 * Click on enable button
	 * Enter �Hello� and verify text is entered successfully
	 * Close the browser
	 */

	public static void main(String[] args) throws InterruptedException {
		String url="https://the-internet.herokuapp.com/";
		setUpDriver("chrome", url);
		
		String text="Dynamic Controls";
		driver.findElement(By.linkText(text)).click();
		
		String buttonXpath="//button[text()='Enable']";
		driver.findElement(By.xpath(buttonXpath)).click();
		
		//1 way
//		WebDriverWait wait=new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
//		
//		String textToEnter="Sunday";
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(textToEnter);
//		
//		String returnedText=driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
//		//compare entered and returned text
//		if (returnedText.equals(textToEnter)) {
//			System.out.println("Text is entered");
//		}else {
//			System.out.println("Text "+textToEnter+" is NOT entered");
//		}
		
		//2way
		//identify the element and then pass it to the exp conditions
		WebElement el=driver.findElement(By.xpath("//input[@type='text']"));
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(el));
		
		String textToEnter="Hi";
		el.sendKeys(textToEnter);
		
		String value=el.getAttribute("value");
		System.out.println(value);
		
		Thread.sleep(5000);
		//driver.quit();
	}
}
		

	


