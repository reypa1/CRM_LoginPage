package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Login_page extends TestBase
{

	@FindBy(xpath="//input[contains(@name,'username')]")  
	WebElement username;
	
	@FindBy(xpath="//input[contains(@name,'password')]")  
	WebElement password;
	
	@FindBy(xpath="//input[contains(@class,'btn btn-small')]")  
	WebElement submit_btn;
	
	public Login_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyTitle()
	{
		 return driver.getTitle();
	}
	
	public void login_page(String user_id, String pass)
	{
		username.sendKeys(user_id);
		password.sendKeys(pass);
		submit_btn.click();
		
		String title1=driver.getTitle();
		System.out.println("Title of home page is : "+title1);
	}
}