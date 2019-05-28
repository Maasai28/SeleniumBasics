package com.class05;public class Notes {
/*
 * Selenium:
-Selenium IDE
-Selenium RC
-Selenium WebDriver
-Selenium Grid

Elements in HTML:

	<tagName attribute="value" attribute ="value">

<a> links
<input> textBox, button, radioButton, checkBox
<table> WebTable
<select> dropDown
<img> image

<human name="John" lastName="Smith">

<input id="Login" class="login_family">

Selenium has 8 locators:
xPath 
cssSelector

xPath syntax:
	//tagName[@attribute='value']
	//tagName[text()='text']

xPath functions:
	contains--> //tagName[contains(@class, 'login_fam')]
	starts-with //tagName[starts-with(@class, 'login_')]
	ends-with //tagName[ends-with(@class, '_family')]

cssSelector syntax
	tagName[attribute='value'] 
	(input[id='Login'])(input[class='login family'])

	shortway
	id --> tagName#idValue (input#Login)
	class--> tagNme.classValue (input.login_family)

css functions
	contains --> tagName[attribute*='value']
	starts with --> tagName[attribute^='startValue']
	ends with --> tagName[attribute$='endValue']

Command for Browser
	.get(String ULR)
	.navigate().to(String ULR)
		forward();
		back();
		refresh();
	.close();
	.quit();
	.maximize();--> for Windows; fullScreen()--> for Mac

for Page;
	getTitle()/getURL();
-------------------------------------------------------------
WebElement Commands

System.setProperty("webdriver.chrome.driver", "path to driver");
WebDriver driver=new WebDriver(); --> cannot because WebDriver is an interface

WebDriver driver=new ChromeDriver();
driver.get("URL");

sendKeys(); --> sends text to the textBox
clear(); --> clears text inside textBox
click(); --> clicks on the element
submit(); --> clciks on the button with type"submit"
isDisplayed(); --> verify if specified element is displayed
getText() --> returns text of specified element
getAttribute(); --> returns Value of specified attribute of that element

 */
}
