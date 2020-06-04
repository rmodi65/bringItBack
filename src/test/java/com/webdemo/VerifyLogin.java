package com.webdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLogin {
	
	
	@Test
	public void automationTest1()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://etrain.info/in");
		String check=driver.getTitle();
		System.out.println("Inside test 1");
		Assert.assertEquals(true, check.contains("Indian"));
		driver.close();
	}
	@Test
	public void automationTest2()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String check=driver.getTitle();
		System.out.println("Inside test 2");
		Assert.assertEquals(true, check.contains("Googl"));
		driver.close();

	}

}
