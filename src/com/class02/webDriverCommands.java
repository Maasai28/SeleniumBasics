package com.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\\Users\\Dougl\\Selenium\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
         String title = driver.getTitle();
        if(title.equalsIgnoreCase("google")) {
        	System.out.println("this is the right title");
        }else {
        	System.out.println("this is not the right title");
        }
        driver.get("http://facebook.com");
        System.out.println(driver.getTitle());
        String title1 = driver.getTitle();
        if(title.equalsIgnoreCase("facebook ")) {
        	System.out.println("this is the right title");
        }else {
        	System.out.println("this is not the right title");
        }
	}
}
