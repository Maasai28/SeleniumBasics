package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sauceDemo {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","\\Users\\Dougl\\Selenium\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("btn_action")).click();
		driver.close();
  }

}
