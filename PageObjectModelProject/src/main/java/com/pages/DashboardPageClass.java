package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageClass {
	WebDriver dpdriver;
public DashboardPageClass(WebDriver driver)
{
	this.dpdriver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(tagName="h1")
WebElement header;

public boolean verifyHeader()
{
	return header.isDisplayed();
}
}
