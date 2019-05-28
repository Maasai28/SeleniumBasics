package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Homework1 extends CommonMethods{
	/* Users Application Form Fill1.
	 * Open chrome browser2.Go to “http://uitestpractice.com/”3.
	 * Click on “Forms” link4.
	 * Fill out the entire form5.
	 * Close the browser
	 */
	

	public static void main(String[] args) {
		
		    String url = "http://uitestpractice.com";
	        setUpDriver("chrome", url);
	        driver.findElement(By.linkText("Form")).click();
	        
	        sendKeys(driver.findElement(By.id("firstname")), "Barack");
	        sendKeys(driver.findElement(By.id("lastname")), "Snow");
	        
	        List<WebElement> radioList = driver.findElements(By.cssSelector("label[class='radio-inline']"));
	        checkRadioButton(radioList, "Single");
	        
	        checkCheckBoxes(driver.findElements(By.cssSelector("label.checkbox-inline")), "Dancing");
	        checkCheckBoxes(driver.findElements(By.cssSelector("label.checkbox-inline")), "Reading");
	        
	        driver.quit();
	        
	        
	        
	        
		

	}

}
