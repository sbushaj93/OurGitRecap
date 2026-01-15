package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	// go to https://facebook.com/
	// fill out the username
	// fill out the password

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");

		// locate the email textbox

		// create a WebElement object
		WebElement emailBox = driver.findElement(By.name("email"));
		// send email to the emailBox
		emailBox.sendKeys("neo@tech.com");

		Thread.sleep(2000);

		// locate the password box
		WebElement passwordBox = driver.findElement(By.name("pass"));
		passwordBox.sendKeys("pass123!");

		Thread.sleep(3000);

		driver.quit();

	}

}
