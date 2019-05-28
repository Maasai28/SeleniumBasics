package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task5 extends CommonMethods{
	/*task
	Ahead to https://jqueryui.com/droppable/
	handle the frame
	drag and drop
	close browser
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		setUpDriver("firefox", "//https://jqueryui.com/droppable");
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		driver.close();
		

	}

}
