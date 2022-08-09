package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Selected_Hotel_Cost {
	public static WebDriver driver;
	public Adactin_Selected_Hotel_Cost(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id = "radiobutton_0")
	private WebElement selhotel;
	
	@FindBy(id ="continue")
	private WebElement continuebtn;
	
	
	public WebElement getSelhotel() {
		return selhotel;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	
	
	
	
	
	

}
