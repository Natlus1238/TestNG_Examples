package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Practise_Tshirt {
	
	public static WebDriver driver;
	
	
	public Automation_Practise_Tshirt(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//span[contains(text(),'Add to cart')]")
	private WebElement addcart;
	
	
	@FindBy(xpath = "//a[contains(text(),'Faded Short Sleeve T-shirts')]")
	private WebElement mouseoveraddcart;
	
	


	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceed;
	
	public WebElement getAddcart() {
		return addcart;
	}

	public WebElement getProceed() {
		return proceed;
	}
	
	public WebElement getMouseoveraddcart() {
		return mouseoveraddcart;
	}
}
