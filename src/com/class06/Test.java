package com.class06;

import org.openqa.selenium.By;

import utils.CommonMethods;

public class Test extends CommonMethods{

	public static void main(String[] args) {
		
		CommonMethods.setUpDriver("firefox", "http://uitestpractice.com/Students/Switchto");
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("iframe_a");
		driver.findElement(By.cssSelector("input#name")).sendKeys("Doug");
		
		driver.close();
		

	}

}
