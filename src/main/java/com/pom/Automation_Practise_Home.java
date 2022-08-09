package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Practise_Home {
	public static WebDriver driver;
	
	public Automation_Practise_Home(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	private WebElement signin;
	

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath = "//a[@title='T-shirts'][1]")
	private WebElement tshirt;
	
	
	public WebElement getSignin() {
		return signin;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getTshirt() {
		return tshirt;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
