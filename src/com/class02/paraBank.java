package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paraBank {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\\Users\\Dougl\\Selenium\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22.com");
        driver.findElement(By.id("customer.firstName")).sendKeys("Bob");
        driver.findElement(By.name("customer.lastName")).sendKeys("Tom");
         driver.findElement(By.id("customer.address.street")).sendKeys("123 Main st");
         driver.findElement(By.id("customer.address.city")).sendKeys("My Town");
         driver.findElement(By.id("customer.addre")).sendKeys("Tom");
         driver.findElement(By.id("customer.lastName")).sendKeys("Tom");
         
	}
}
