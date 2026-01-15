package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
	/*
	 * 
	 * Open chrome browser
		Go to "https://www.facebook.com/"
		Click on Sign Up link
		Enter first name
		Enter last name
		Enter email address
		Re-enter email address
		Click on Sign Up button
	 */

	public static final String url = "https://facebook.com";

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get(url);

		driver.findElement(By.linkText("Create new account")).click();

		Thread.sleep(3000);

		// first name
		driver.findElement(By.name("firstname")).sendKeys("Achraf");

		// last name
		driver.findElement(By.name("lastname")).sendKeys("A.");

		// email
		driver.findElement(By.name("reg_email__")).sendKeys("achraf@neo.com");

		// password
		driver.findElement(By.id("password_step_input")).sendKeys("A123$$$");

		Thread.sleep(5000);

		// submit button
		driver.findElement(By.name("websubmit")).click();

		Thread.sleep(2000);

		driver.quit();

	}

}
