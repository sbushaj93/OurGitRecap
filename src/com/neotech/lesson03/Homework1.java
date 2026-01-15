package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
	/*
	 * Open chrome browser
		Go to "https://demo.guru99.com/test/newtours/"
		Click on Register Link
		Fill out ALL required info
		Click Submit
		User successfully registered
		(Create the script using different locators)
	 */

	public static final String url = "https://demo.guru99.com/test/newtours/";

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		Thread.sleep(3000);

		// locate the register link and click on it
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000);

		// fill the form:
		// first name
		driver.findElement(By.name("firstName")).sendKeys("Massinissa");
		// last name
		driver.findElement(By.name("lastName")).sendKeys("C.");
		// phone
		driver.findElement(By.name("phone")).sendKeys("555 6666 4544");
		// email
		driver.findElement(By.id("userName")).sendKeys("me@neo.com");

		// address
		driver.findElement(By.name("address1")).sendKeys("Main St apt no 2");

		// city
		driver.findElement(By.name("city")).sendKeys("NYC");

		// state
		driver.findElement(By.name("state")).sendKeys("NY");

		// postal code
		driver.findElement(By.name("postalCode")).sendKeys("43001");

		// username
		driver.findElement(By.id("email")).sendKeys("neo");

		// password
		driver.findElement(By.name("password")).sendKeys("Neo@1234");

		// confirm password
		driver.findElement(By.name("confirmPassword")).sendKeys("Neo@1234");

		Thread.sleep(5000);

		// click the submit button
		driver.findElement(By.name("submit")).click();

		Thread.sleep(5000);

		driver.quit();

	}

}
