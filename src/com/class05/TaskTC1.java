package com.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTC1 {

	 static String userName="standard_user";
	 static String passWord = "secret_sauce";
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\\Users\\Dougl\\Selenium\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		WebElement userNameTxt = driver.findElement(By.cssSelector("input[id*='user-name']"));
		userNameTxt.sendKeys(userName);
		WebElement pwdTxt = driver.findElement(By.cssSelector("input[type='password']"));
		pwdTxt.sendKeys(passWord);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		boolean isDisplayed = driver.findElement(By.cssSelector("div[class='product_label']")).isDisplayed();
		if (isDisplayed) {
			System.out.println("Products text is displayed");
		} else {
			System.out.println("Product text is NOT displayed");
		}
		driver.quit();
   }

}
