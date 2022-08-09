package com.runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.sdp.Pom_Object_Manager;

import com.baseclass.Base_Class;

public class Pages_Runner_Class extends Base_Class {
	public static WebDriver driver = Base_Class.gettingBrowser("chrome");
	public static Pom_Object_Manager pom = new Pom_Object_Manager(driver);
	
	public static void main(String[] args) {
		
		gettingurl("https://www.google.com/intl/en-GB/gmail/about/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		clickOnElement(pom.getHp().getCreateacc());
		sendText(pom.getSp().getFname(), "Mohammad");
		sendText(pom.getSp().getLname(), "Sultan");
		clear_Text(pom.getSp().getEmail());
		sendText(pom.getSp().getEmail(), "sultan12381238");
		sendText(pom.getSp().getPass(), "Sultan@1238");
		sendText(pom.getSp().getConfirmpass(), "Sultan@1238");
		clickOnElement(pom.getSp().getShowpass());
		clickOnElement(pom.getSp().getNext());
		sendText(pom.getVp().getPhone(), "8190014758");
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
		
}
