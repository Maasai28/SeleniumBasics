package Workstation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Study {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\Dougl\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		//driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Gift Cards")).click();
		//driver.findElement(By.partialLinkText("Cards")).click();
		//driver.findElement(By.id("searchDropdownBox")).click();
		//driver.findElement(By.xpath("//a[@href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gift_cards']")).click();
		//driver.findElement(By.xpath("//a[@href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gift_cards']")).click();
		Thread.sleep(3000);
		//driver.navigate().back();
		//driver.navigate().refresh();
		//String str=driver.getTitle();
		//System.out.println(str);
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
