package com.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dougl\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/r.php?locale=en_GB");
		driver.findElement(By.name("firstname")).sendKeys("Java");
		driver.findElement(By.name("lastname")).sendKeys("Tesrer");
		driver.findElement(By.name("email")).sendKeys("dagi28@yahoo.com");

	}

}
