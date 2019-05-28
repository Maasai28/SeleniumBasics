package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCommands {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","\\Users\\Dougl\\Selenium\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.walmart.com");
		//Thread.sleep(1000);  // slows down the running of selenium by 3 sec
		driver.navigate().to("http://google.com");
		//Thread.sleep(1000);
		driver.navigate().back();
		//Thread.sleep(1000);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
		
	}
}
