package com.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
/*TC 1: Amazon Page Title Verification:
  Open chrome browser
  Go to “https://www.amazon.com/”
  Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, 
  Computers, Books, DVDs & more” is displayed
  
 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","\\Users\\Dougl\\Selenium\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		System.out.println(driver.getTitle());
        String title = driver.getTitle();
        if(title.equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
        	System.out.println("this is the right title");
        }else {
        	System.out.println("this is not the right title");
        }
      driver.quit();
	}
}


