package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonGridScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dougl\\Selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cake");
        driver.findElement(By.className("nav-input")).click();
        driver.close();
	}

}
