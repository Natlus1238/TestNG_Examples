package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Search_Hotel {
	public static WebDriver driver;
	public Adactin_Search_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy (id = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement rooms;
	
	@FindBy(id = "room_nos")
	private WebElement noofroom;
	
	@FindBy(id = "datepick_in")
	private WebElement datein;
	
	@FindBy(id = "datepick_out")
	private WebElement dateout;
	
	@FindBy(id = "adult_room")
	private WebElement addultcount;
	
	@FindBy(id = "child_room")
	private WebElement childcount;
	
	@FindBy(id = "Submit")
	private WebElement search;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getNoofroom() {
		return noofroom;
	}

	public WebElement getDatein() {
		return datein;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAddultcount() {
		return addultcount;
	}

	public WebElement getChildcount() {
		return childcount;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	
	
	
}
