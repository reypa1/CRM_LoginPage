package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SignUp_page extends TestBase
{
	@FindBy(xpath="//button[contains(@class,'btn')]") 
	WebElement signup;
	
	@FindBy(xpath="//input[contains(@name,'first_name')]") 
	WebElement firstname;
	
	@FindBy(xpath="//input[contains(@name,'surname')]") 
	WebElement lastname;
	
	@FindBy(xpath="//input[contains(@name,'email')]") 
	WebElement email;
	
	@FindBy(xpath="//input[contains(@name,'email_confirm')]") 
	WebElement email_confirm;
	
	@FindBy(xpath="//input[contains(@name,'username')]") 
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']") 
	WebElement password;
	
	@FindBy(xpath="//input[contains(@name,'passwordconfirm')]") 
	WebElement password_confirm;
	
	@FindBy(xpath="//input[contains(@name,'agreeTerms')]") 
	WebElement checkbox;
	
	@FindBy(xpath="//div[contains(@class,'myButton')]") 
	WebElement submit;
	
	public SignUp_page()
	{
		PageFactory.initElements(driver, this);
	}	
	
	public void signup_btn()
	{
		signup.click();
	}
	
	public void firstname(String first_name)
	{
		firstname.sendKeys(first_name);
	}
	
	public void lasttname(String last_name)
	{
		lastname.sendKeys(last_name);
	}
	
	public void Email(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void Email_confirm(String confirm_mail)
	{
		email_confirm.sendKeys(confirm_mail);
	}
	
	public void user_name(String UserName)
	{
		username.sendKeys(UserName);
	}
	
	public void Password(String passWord)
	{
		password.sendKeys(passWord);
	}
	
	public void Password_confirm(String passwordconfirm)
	{
		password_confirm.sendKeys(passwordconfirm);
	}
	
	public void checkBox()
	{
		checkbox.click();
	}
	
	public void Submit_btn()
	{
		submit.click();
	}
}
