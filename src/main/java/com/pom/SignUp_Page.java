package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp_Page {
	public static WebDriver driver;
	
	@FindBy(id = "firstName")
	private WebElement fname;
	
	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement lname;
	@FindBy(name = "Username")
	private WebElement email;
	@FindBy(name = "Passwd")
	private WebElement pass;
	@FindBy(name = "ConfirmPasswd")
	private WebElement confirmpass;
	@FindBy(xpath = "//div[contains(text(),'Show password')]")
	private WebElement showpass;
	@FindBy (xpath = "//span[contains(text(),'Next')]")
	private WebElement next;
	
	
	public SignUp_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFname() {
		return fname;
	}
	
	public WebElement getLname() {
		return lname;
	}
	
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getPass() {
		return pass;
	}
	
	public WebElement getConfirmpass() {
		return confirmpass;
	}
	
	public WebElement getShowpass() {
		return showpass;
	}
	
	public WebElement getNext() {
		return next;
	}
	
}
