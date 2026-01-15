package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
	/*
	HW1: Amazon Page Title Verification: 
		Open chrome browser
		Go to “https://www.amazon.com/”
		Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
		End the Session (close the browser).
	*/
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test passed!");
		} else {
			System.out.println("Test failed!!!");
		}

		Thread.sleep(3000);
		driver.quit();
	}

}
