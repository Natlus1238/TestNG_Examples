package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Final_Page {
	public static WebDriver driver;
	@FindBy(id = "first_name")
	private WebElement fname;
	
	@FindBy(id = "last_name")
	private WebElement lname;
	
	@FindBy(id = "address")
	private WebElement addressbox;
	
	@FindBy(id = "cc_num")
	private WebElement cardnum;
	
	@FindBy(id ="cc_type")
	private WebElement cardtype;
	
	@FindBy(id ="cc_exp_month")
	private WebElement cardexpirymon;
	
	@FindBy(id ="cc_exp_year")
	private WebElement cardexpiryyear;
	
	@FindBy(id ="cc_cvv")
	private WebElement cardccv;
	
	@FindBy(id ="book_now")
	private WebElement booking;
	
	@FindBy(id = "logout")
	private WebElement logout;
	
	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddressbox() {
		return addressbox;
	}

	public WebElement getCardnum() {
		return cardnum;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getCardexpirymon() {
		return cardexpirymon;
	}

	public WebElement getCardexpiryyear() {
		return cardexpiryyear;
	}

	public WebElement getCardccv() {
		return cardccv;
	}

	public WebElement getBooking() {
		return booking;
	}

	public WebElement getLogout() {
		return logout;
	}

	public Adactin_Final_Page(WebDriver driver2) {
		this.driver = driver2;
				PageFactory.initElements(driver, this);
	}
	
	
	
}
