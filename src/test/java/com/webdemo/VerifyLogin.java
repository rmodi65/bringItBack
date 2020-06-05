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
	
	
	@Test
	public void automationTest1() throws MalformedURLException
	{
		DesiredCapabilities dr=null;
		dr=DesiredCapabilities.chrome();
		dr.setBrowserName("chrome");
		dr.setPlatform(Platform.WINDOWS);
	//	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	    WebDriver driver =new RemoteWebDriver(new URL("http://192.168.1.7:4444/wd/hub"),dr);
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
