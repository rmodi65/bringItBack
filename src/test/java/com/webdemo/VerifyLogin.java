package com.webdemo;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLogin {
	public static final String USERNAME = "rohitmodi3";
	public static final String AUTOMATE_KEY = "J5QyCReTX5qJrHt7xVGo";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
	
	
	@Test
	public void automationTest1() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
        
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "7");
		caps.setCapability("browser", "Firefox");
		caps.setCapability("browser_version", "74");
		caps.setCapability("name", "rohitmodi3's First Test");
		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		//	 WebDriver driver=new ChromeDriver();
		driver.get("https://etrain.info/in");
		String check=driver.getTitle();
		System.out.println("Inside test 1");
		Assert.assertEquals(true, check.contains("Indian"));
		System.out.println(driver.getTitle());
		driver.close();
	}
//	@Test
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
