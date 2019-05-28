package com.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.CommonMethods;

public class Task6 extends CommonMethods{
	/*Task Two
	Ahead to http://uitestpractice.com/Students/Index
	Click on the Home
	Handle the drag and drop
	Close the browser
	*/

	public static void main(String[] args) {
		setUpDriver("firefox", "http://uitestpractice.com/Students/Index");
		driver.findElement(By.xpath("//a[text()='Actions']")).click();
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		Actions action = new Actions(driver);
		//action.dragAndDrop(drag, drop).perform();
		action.clickAndHold(drag).moveToElement(drop).release(drag).perform();
		driver.close();
		
		

	}

}
