package com.class06;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	/* TC 1: Amazon Department List Verification
        Open chrome browser
        Go to “http://amazon.com/”
		Verify how many department options available.
		Print each department
		Select Computers
		Quit browser
	 * 
	 */

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dougl\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.com/");
		WebElement DepartmentDD = driver.findElement(By.cssSelector("select#searchDropdownBox"));
		Select select = new Select(DepartmentDD);
		List<WebElement> allOptions=select.getOptions();
		System.out.println("# of option in Department DD="+allOptions.size());
		Iterator<WebElement> it=allOptions.iterator();
		while(it.hasNext()) {
			String optionText=it.next().getText();
			System.out.println(optionText);
			select.selectByVisibleText("Computers");
			driver.quit();
	}
  }
}
