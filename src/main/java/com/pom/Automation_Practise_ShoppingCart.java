package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Practise_ShoppingCart {
	public static WebDriver driver;
	
	public Automation_Practise_ShoppingCart(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceed2;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "passwd")
	private WebElement password;
	
	@FindBy(id = "SubmitLogin")
	private WebElement Submit;
	
	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement proceedsubmit;
	
	@FindBy(id = "cgv")
	private WebElement checkagreement;
	
	@FindBy(xpath = "//button[@name='processCarrier']")
	private WebElement proceed3;
	
	@FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?mylogout=']")
	private WebElement signout;

	public WebElement getProceed2() {
		return proceed2;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	public WebElement getProceedsubmit() {
		return proceedsubmit;
	}

	public WebElement getCheckagreement() {
		return checkagreement;
	}

	public WebElement getProceed3() {
		return proceed3;
	}

	public WebElement getSignout() {
		return signout;
	}
	
	
	
	
	
	
	
	
	
	
}
