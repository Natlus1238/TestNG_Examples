package com.testng.features.testing;

import org.openqa.selenium.WebDriver;
import org.sdp.Adactin_Manager;

import org.testng.annotations.Test;

import com.baseclass.Base_Class;

@Test(groups = "all methods")
public class Testng_GroupsofGroups_Grouping extends Base_Class {
	public static WebDriver driver = Base_Class.gettingBrowser("chrome");
	public static Adactin_Manager adm = new Adactin_Manager(driver);

	@Test(priority = -2 , groups = "neededmethod")
	private void openingurl() {
		waitimplicit();
		gettingurl("https://adactinhotelapp.com/");

	}

	@Test(priority = -1 , groups = "neededmethod")
	private void signingin() {
		waitimplicit();
		sendText(adm.getLp().getUsername(), "Sultan1238");
		sendText(adm.getLp().getPassword(), "Pass@123");
		clickOnElement(adm.getLp().getLogin());

	}

//	@Test(groups = "main method")
//	private void bookingandselecting() {
//		waitimplicit();
//		select_dropdown(adm.getSh().getLocation(), "by visible text", "Brisbane");
//		select_dropdown(adm.getSh().getHotel(), "by visible text", "Hotel Hervey");
//		select_dropdown(adm.getSh().getRooms(), "by visible text", "Deluxe");
//		select_dropdown(adm.getSh().getNoofroom(), "by visible text", "4 - Four");
//		sendText(adm.getSh().getDatein(), "20/05/2020");
//		sendText(adm.getSh().getDateout(), "22/06/2021");
//		select_dropdown(adm.getSh().getAddultcount(), "by visible text", "3 - Three");
//		select_dropdown(adm.getSh().getChildcount(), "by visible text", "2 - Two");
//		clickOnElement(adm.getSh().getSearch());
//		clickOnElement(adm.getSelhc().getSelhotel());
//		clickOnElement(adm.getSelhc().getContinuebtn());
//		sendText(adm.getFp().getFname(), "Mohammad");
//		sendText(adm.getFp().getLname(), "Sultan");
//		sendText(adm.getFp().getAddressbox(), "Pattalam, Tambaram");
//		sendText(adm.getFp().getCardnum(), "1542758962531485");
//		select_dropdown(adm.getFp().getCardtype(), "by Visible text", "Master Card");
//		select_dropdown(adm.getFp().getCardexpirymon(), "by Visible text", "March");
//		select_dropdown(adm.getFp().getCardexpiryyear(), "by Visible text", "2013");
//		sendText(adm.getFp().getCardccv(), "157");
//		clickOnElement(adm.getFp().getBooking());
//	}
//
//	@Test(groups = "signing")
//	private void signingout() {
//		waitimplicit();
//		clickOnElement(adm.getFp().getLogout());
//
//	}

	@Test(priority = 0, groups = "closebrowser")
	private void closingbrowser() {
		closebrowser();
	}

}
