package com.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsWithXPath {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","\\Users\\Dougl\\Selenium\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.xpath("//input[starts-with(@name,'fir')]")).sendKeys("John");;
		driver.findElement(By.xpath("//input[starts-with(@name,'la')]")).sendKeys("Doe");
		driver.findElement(By.xpath("//input[starts-with(@name,'ph')]")).sendKeys("911");
		driver.findElement(By.xpath("//input[starts-with(@id,'us')]")).sendKeys("test123@gmail.com");
		driver.findElement(By.xpath("//input[starts-with(@name,'add')]")).sendKeys("123 main street");
		driver.findElement(By.xpath("//input[starts-with(@name,'ci')]")).sendKeys("Ashburn");
		driver.findElement(By.xpath("//input[starts-with(@name,'st')]")).sendKeys("VA");
		driver.findElement(By.xpath("//input[starts-with(@name,'po')]")).sendKeys("00000");
		driver.findElement(By.xpath("//input[starts-with(@id,'em')]")).sendKeys("test123");
		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("123");
		driver.findElement(By.xpath("//input[starts-with(@name,'con')]")).sendKeys("123");
		driver.findElement(By.xpath("//input[starts-with(@name,'reg')]")).click();
		driver.close();
		
		System.out.println("\\"+5); 
	}

}
