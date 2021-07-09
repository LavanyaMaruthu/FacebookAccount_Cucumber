package com.testcucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App {
	public static WebDriver driver;

	public static WebDriver getBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\eclipse-workspace_cuucmber\\Democucumber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		return driver;
		// TODO Auto-generated method stub

	}
}
