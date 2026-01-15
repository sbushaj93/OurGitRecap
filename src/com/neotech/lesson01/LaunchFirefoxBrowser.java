package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {


		//So, what are the steps to follow on a test???
		
		
		//1. Open the browser
		WebDriver driver = new FirefoxDriver();
		
		
		//2. Go to the url 
		driver.get("https://www.neotechacademy.com/");
		
		//we can pause the execution just to see that we actually went to the URL 
		Thread.sleep(2000);
		
		
		//3. This is where we would perform tests (based on the documentation)
		
		//Let us assume that out test is: we want to get the current URL and we want to check if it is https://www.neotechacademy.com/
		
		
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.neotechacademy.com/";
		
		
		if (actualUrl.equals(expectedUrl))
		{
			System.out.println("Page Title: " + driver.getTitle());
		}
		else
		{
			System.out.println("The URL is wrong!!!");
		}
		
		//pause execution for 2 seconds
		Thread.sleep(2000);
		
		
		//4. Quit the browser
		driver.quit();
		
	}

}
