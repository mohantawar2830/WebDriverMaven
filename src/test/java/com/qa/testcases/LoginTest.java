package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	 static WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	@Test
	public void doLogin() throws InterruptedException
	{
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']"));
		driver.findElement(By.xpath("//input[@id='pass']"));
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}

}
