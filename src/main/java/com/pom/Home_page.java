package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
public static WebDriver driver;
	@FindBy(xpath = "//span[contains(text(),'Create an account')][1]")
	private WebElement createacc;
	






	public Home_page(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}







	public WebElement getCreateacc() {
		return createacc;
	}
	
}
