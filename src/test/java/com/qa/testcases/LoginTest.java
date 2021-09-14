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
	public void doLogin()
	{
		driver.get("https://classic.freecrm.com/index.html");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("mohantawar");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mohan@2830");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("(//a[@class='topnavlink'])[3]")).click();
	}
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}

}
