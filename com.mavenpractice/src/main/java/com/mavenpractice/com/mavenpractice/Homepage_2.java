package com.mavenpractice.com.mavenpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_2 {
	
	public WebDriver Netflix=null;
	
	@FindBy(xpath = "//a[@class='authLinks redButton']")
	WebElement Mysign;
	@FindBy(xpath ="//input[@id='id_userLoginId']")
	WebElement Myemail;
	@FindBy(xpath = "//input[@id='id_password']")
	WebElement Mypass;
	@FindBy(xpath ="//button[@class='btn login-button btn-submit btn-small']")
	WebElement Mysigninbutton;
	
	public Homepage_2 (WebDriver Netflix) {
		
		this.Netflix=Netflix;
		PageFactory.initElements(Netflix, this);
	}
	public void netflix (String email, String pass) {
		Mysign.click();
		Myemail.sendKeys(email);
		Mypass.sendKeys(pass);
		Mysigninbutton.click();
		
	}	

}
