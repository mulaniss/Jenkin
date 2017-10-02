package com.selenium.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void DemoRun() {

		System.out.println("Welcome To jenkins");
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium-Appium\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.seleniumhq.org");
		System.out.println("The URL is launched successfully");

		String title = driver.getTitle();
		System.out.println("The Window title is: " + title);
	}

}
