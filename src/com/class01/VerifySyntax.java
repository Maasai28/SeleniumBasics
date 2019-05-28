package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifySyntax {
/*TC 2: Syntax Page URL Verification:
     Open chrome browser
     Navigate to “https://www.syntaxtechs.com/”
     Navigate to “https://www.google.com/”
     Navigate back to Syntax Technologies Page
     Refresh current page
     Verify url contains “Syntax”*/
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","\\Users\\Dougl\\Selenium\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.walmart.com");
		
		driver.navigate().to("http://google.com");
	
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
	}
}
