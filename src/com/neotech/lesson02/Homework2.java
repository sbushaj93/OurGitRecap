package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {
	/*
	HW2: Opening Page on Firefox Browser
	Open Firefox browser
	Navigate to “https://www.redfin.com/”
	Verify that you have navigated to (https://www.redfin.com/)
	End the Session (close the browser). 
	*/
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver(); // Ctrl + Shift + O

		driver.get("https://www.redfin.com/");

		Thread.sleep(3000);

		String expectedUrl = "https://www.redfin.com/";
		String actualUrl = driver.getCurrentUrl();

		if (expectedUrl.equalsIgnoreCase(actualUrl)) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!!!");
			System.out.println("Expected URL: " + expectedUrl);
			System.out.println("Actual URL: " + actualUrl);
		}

		driver.quit();
	}

}
