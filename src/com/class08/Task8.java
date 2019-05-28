package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task8 extends CommonMethods{
	/*Task Three
	Ahead to http://uitestpractice.com/Students/Index
	Click on the Actions
	Click and hold on 1,2,3,4 boxes
	Close the browser
	 * 
	 */

	public static void main(String[] args) {
		setUpDriver("firefox", "http://uitestpractice.com/Students/Index");
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		WebElement drag1 = driver.findElement(By.xpath("//li[@name='one']"));
	    WebElement drag2 = driver.findElement(By.xpath("//li[@name='two']"));
		WebElement drag3 = driver.findElement(By.xpath("//li[@name='three']"));
		WebElement drag4 = driver.findElement(By.xpath("//li[@name='four']"));
		Actions action = new Actions(driver);
		action.moveToElement(drag1).clickAndHold().moveToElement(drag2).clickAndHold().moveToElement(drag3).clickAndHold()
		.moveToElement(drag4).build().perform();
		driver.close();
		

	}

}
