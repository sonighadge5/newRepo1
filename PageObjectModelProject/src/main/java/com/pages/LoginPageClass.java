package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	WebDriver lpdriver;
	public LoginPageClass(WebDriver driver)
	{
		this.lpdriver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement uname;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(xpath="//button")
	WebElement loginbutton;
	
	public void loginToApp(String u,String p)
	{
		uname.sendKeys(u);
		pass.sendKeys(p);
		loginbutton.click();
	}
	
	public DashboardPageClass validLogin()
	{
		uname.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		loginbutton.click();
		return new DashboardPageClass(lpdriver);
	}
}
