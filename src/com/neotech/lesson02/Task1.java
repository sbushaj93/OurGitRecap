package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	/*
	Open chrome browser
	Go to "https://demo.guru99.com/test/newtours/"
	Click on Register Link
	
	Fill out just
	First Name:	
	Last Name:	
	Phone:	
	Email:	
	And Click Submit 
	
	*/
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");

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

		Thread.sleep(5000);

		// click the submit button
		driver.findElement(By.name("submit")).click();

		Thread.sleep(5000);

		driver.quit();

	}

}
