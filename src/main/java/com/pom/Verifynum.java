package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verifynum {
public static WebDriver driver;
@FindBy(xpath = "//input[@id='phoneNumberId']")
private WebElement phone;




public Verifynum(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}




public WebElement getPhone() {
	return phone;
}


}
