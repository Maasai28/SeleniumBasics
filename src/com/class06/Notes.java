package com.class06;public class Notes {
/*
 * 
 * 
Maximize Browser Window

driver.manage().window().maximize() --> windows
driver.manage().window().fullScreen() --> mac

findElement() vs findElements()

findElement() --> return 1 element, if multiple matching elements it will retur first matching (top--> bottom). If not element found will get an Exception (NoSuchElementException)

findElements() --> returns a List of WebElement. If no elements found we will get EMPTY LIST

Radio Button and CheckBox

isEnabled();
isSelected();
click();

Easily identfied by ID
If we specify name --> will get a radio group/ group of checkboxes

List<WebElement> allRadio=driver.findElements(By.name("name"));
allRadio.size(); --> will tell you how many element in that group

Radio Button vs CheckBox
Radio Button only 1 at the time, while CheckBox multiple can be selected

DropDown(ComBobox) and MultiSelect(List/ListBox);
Has to be written using <select> !!!

If the DD is written using <select> --> then we Can use SELECT CLASS

Select select = new Select(WebElement);--> must be a type of DD with <select>

Select options from DD
- selectByIndex();
- selectByValue();
- selectByVisibleText();

How to get all options from DD
List<Webelement> optionsFromDD=getOptions();

How would you findout if DD accept multiple selection
boolean yesOrNo=isMultiple();

How would you deselect options/all options?
WORKS ONLY WITH MULTIPLE SELECT DD/ LISTBOX/LIST

deselectByIndex();
deselectByValue();
deselectByVisibleText();
deselectAll();

Using Selenium we CANNOT handle windows based pop ups
Handling Alerts: - WebBased pop up/alert JavaScript pop up/alert

Once alert comes you CANNOT interract with your browser
Alerts MUST be handled

3 Types of JS Alerts:
- simple alert - accept()==clik ok
- confirmation alert - accept()/reject() ==click ok or cancel
- prompt alert - enter text & accept/reject ==sendKeys & click ok/cancel

To handle JS alert we need to SWITCH focus of our driver to that window alert.
To work with alerts we have an Alert interface in Selenium
	 accept();
	 dismiss();
	 getText();
	 sendKeys();

WebDriver driver = new ChromeDriver();
driver.get("URL");

Alert alert=driver.switchTo().alert();
alert.accept();
 */
}
