package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task extends CommonMethods{

	public static void main(String[] args) {
		
		String url = "https://jqueryui.com/";
        String ExpectedDay = "10";
        String Expectedmonth = "August";
        String Expectedyear = "2019";
        String ExpectedDate = "08/10/2019";
        
        setUpDriver("chrome", url);
        driver.findElement(By.linkText("Datepicker")).click();
        
        //convert view to frame
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
        driver.findElement(By.cssSelector("input#datepicker")).click();
        
        while(!driver.findElement(By.cssSelector("span.ui-datepicker-month")).getText().equals(Expectedmonth)) {
            driver.findElement(By.cssSelector("a[title='Next']")).click();
        }
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        
        for(WebElement e:dates) {
            if(e.getText().equals(ExpectedDay)){
                e.click();
                break;
            }
        }
        WebElement date = driver.findElement(By.cssSelector("input#datepicker"));
        if(date.isDisplayed()) {
            if(date.getAttribute("value").equals(ExpectedDate)) {
                System.out.println("TC Passed : Expected date is " + date.getAttribute("value"));
            }
        }
    
        //Thread.sleep(5000);
        driver.quit();
        
    }
}

	


