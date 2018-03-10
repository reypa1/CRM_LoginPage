package com.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.Login_page;

public class Loginpage_Test extends TestBase
{
	Login_page loginpage;

	public Loginpage_Test()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage=new Login_page();
	}
	
	@Test(priority=1)
	public void validate_login_title()
	{
		String title=loginpage.verifyTitle();
		Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
	    System.out.println("Title of login page is : "+title);
	}
	
	@Test(priority=2)
	public void login()
	{
		loginpage.login_page(prop.getProperty("username"),prop.getProperty("password"));	
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();	
	}
}
