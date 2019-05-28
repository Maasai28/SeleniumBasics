package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task1 extends CommonMethods{
	/*
	 * Table headers and rows verification

		Open chrome browser
		Go to “https://the-internet.herokuapp.com/”
		Click on “Click on the “Sortable Data Tables” link
		Verify tables consist of 4 rows and 6 columns
		Print name of all column headers
		Print data of all rows
	 */

	public static void main(String[] args) throws InterruptedException {
		
		setUpDriver("chrome", "https://the-internet.herokuapp.com/tables");
		List <WebElement> row=driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		System.out.println("Number of colums ="+row.size());
		
		
		for (WebElement ele: row) {
			String text=ele.getText();
			System.out.println(text);
		}
		List <WebElement> col=driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/th"));
		System.out.println("Number of colums ="+col.size());
		
		
		for (WebElement ele1: row) {
			String text1=ele1.getText();
			System.out.println(text1);
		}
		

		Thread.sleep(3000);
		driver.quit();
		
	}

}
		

	


