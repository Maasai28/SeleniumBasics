package com.class09;

import utils.CommonMethods;

public class TestDrivers extends CommonMethods{

	public static void main(String[] args) {
		setUpDriver("firefox", "http://www.google.com");
		driver.quit();

	}

}
