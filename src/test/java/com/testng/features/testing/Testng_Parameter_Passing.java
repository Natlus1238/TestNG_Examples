package com.testng.features.testing;

import org.openqa.selenium.WebDriver;
import org.sdp.Adactin_Manager;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;

public class Testng_Parameter_Passing extends Base_Class {
	public static WebDriver driver = Base_Class.gettingBrowser("chrome");
	public static Adactin_Manager adm = new Adactin_Manager(driver);

	@Test(priority = -2)
	private void openingurl() {
		waitimplicit();
		gettingurl("https://adactinhotelapp.com/");

	}

	@Test(priority = -1)
	@Parameters({"usr", "pass"})//we have to pass parameter value from xml file and run it from xml file
	private void signingin(String usr, String Pass) {
		waitimplicit();
		sendText(adm.getLp().getUsername(), usr);
		sendText(adm.getLp().getPassword(), Pass);
		clickOnElement(adm.getLp().getLogin());

	}

	@Test(priority = 0)
	@Parameters({"datein","dateout","fname","lname"})
	private void bookingandselecting(String datein, String dateout, String fname, String lname) {
		waitimplicit();
		select_dropdown(adm.getSh().getLocation(), "by visible text", "Brisbane");
		select_dropdown(adm.getSh().getHotel(), "by visible text", "Hotel Hervey");
		select_dropdown(adm.getSh().getRooms(), "by visible text", "Deluxe");
		select_dropdown(adm.getSh().getNoofroom(), "by visible text", "4 - Four");
		sendText(adm.getSh().getDatein(), datein);
		sendText(adm.getSh().getDateout(), dateout);
		select_dropdown(adm.getSh().getAddultcount(), "by visible text", "3 - Three");
		select_dropdown(adm.getSh().getChildcount(), "by visible text", "2 - Two");
		clickOnElement(adm.getSh().getSearch());
		clickOnElement(adm.getSelhc().getSelhotel());
		clickOnElement(adm.getSelhc().getContinuebtn());
		sendText(adm.getFp().getFname(), fname);
		sendText(adm.getFp().getLname(), lname);
		sendText(adm.getFp().getAddressbox(), "Pattalam, Tambaram");
		sendText(adm.getFp().getCardnum(), "1542758962531485");
		select_dropdown(adm.getFp().getCardtype(), "by Visible text", "Master Card");
		select_dropdown(adm.getFp().getCardexpirymon(), "by Visible text", "March");
		select_dropdown(adm.getFp().getCardexpiryyear(), "by Visible text", "2013");
		sendText(adm.getFp().getCardccv(), "157");
		clickOnElement(adm.getFp().getBooking());
	}

	@Test(priority = 1)
	private void signingout() {
		waitimplicit();
		clickOnElement(adm.getFp().getLogout());

	}

	@Test(priority = 2)
	private void closingbrowser() {
		closebrowser();
	}

}
