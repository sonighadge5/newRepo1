package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.LoginPageClass;



public class LoginTestClass {
	WebDriver driver;
	LoginPageClass lp;
	
	@BeforeSuite
	public void setup()
	{
		System.setProperty("webdriver.chromedriver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///E:/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		lp=new LoginPageClass(driver);
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.close();
	}
	
	@Test
	public void verifyLogin()
	{
		lp.loginToApp("kiran@gmail.com","123456");
		System.out.println("after login user should on homepage");
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		
	}
}
