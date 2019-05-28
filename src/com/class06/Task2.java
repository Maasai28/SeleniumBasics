package com.class06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {
	/* Select and Deselect values
		Open chrome browser
		Go to “http://uitestpractice.com/”
		Click on “Select” tab
		Verify how many options available in the first drop down and then select “United states of America”
		Verify how many options available in the second drop down and then select all.
		Deselect China from the second drop down
		Quit browser (edited) 
	 * 
	 */

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dougl\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Select')]")).click();
		//driver.findElement(By.linkText("Select")).click();
		WebElement CountriesDD = driver.findElement(By.id("countriesSingle"));
		Select select = new Select(CountriesDD);
		int ddSize = select.getOptions().size();
		System.out.println("# of option countries DD="+ddSize);
		select.selectByVisibleText("United states of America");
		
		WebElement SecondDD=driver.findElement(By.cssSelector("select#countriesMultiple"));
		Select select1=new Select(SecondDD);
		List<WebElement> optionList = select.getOptions(); 
		ddSize = select.getOptions().size();
		System.out.println("# of options in second DD="+ddSize);
		if (select.isMultiple()) {
			for (int i=0; i<ddSize; i++) {
				select.selectByIndex(i);
			}
		
		}
		driver.quit();
	}

}
