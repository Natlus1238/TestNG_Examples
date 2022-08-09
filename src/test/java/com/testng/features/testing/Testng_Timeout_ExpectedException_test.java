package com.testng.features.testing;
import org.openqa.selenium.WebDriver;
import org.sdp.Adactin_Manager;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

import com.baseclass.Base_Class;



public class Testng_Timeout_ExpectedException_test extends Base_Class {
	public static WebDriver driver = Base_Class.gettingBrowser("chrome");
	public static Adactin_Manager adm = new Adactin_Manager(driver);

//	thread timeout exceptions (if timeout is less than thread), we can use expected exception in this
//	@Test(priority = -2 , timeOut = 400, expectedExceptions = ThreadTimeoutException.class )
//	private void openingurl1() throws InterruptedException {
//		Thread.sleep(500);
//		gettingurl("https://adactinhotelapp.com/");
//
//	}

	@Test(priority = -2 , timeOut = 5000)
	private void openingurl() throws InterruptedException {
		Thread.sleep(2000);
		gettingurl("https://adactinhotelapp.com/");

	}
	
	@Test(priority = -1)
	private void signingin() {
		waitimplicit();
		sendText(adm.getLp().getUsername(), "Sultan1238");
		sendText(adm.getLp().getPassword(), "Pass@123");
		clickOnElement(adm.getLp().getLogin());

	}

	@Test(priority = 0)
	private void bookingandselecting() {
		waitimplicit();
		select_dropdown(adm.getSh().getLocation(), "by visible text", "Brisbane");
		select_dropdown(adm.getSh().getHotel(), "by visible text", "Hotel Hervey");
		select_dropdown(adm.getSh().getRooms(), "by visible text", "Deluxe");
		select_dropdown(adm.getSh().getNoofroom(), "by visible text", "4 - Four");
		sendText(adm.getSh().getDatein(), "20/05/2020");
		sendText(adm.getSh().getDateout(), "22/06/2021");
		select_dropdown(adm.getSh().getAddultcount(), "by visible text", "3 - Three");
		select_dropdown(adm.getSh().getChildcount(), "by visible text", "2 - Two");
		clickOnElement(adm.getSh().getSearch());
		clickOnElement(adm.getSelhc().getSelhotel());
		clickOnElement(adm.getSelhc().getContinuebtn());
		sendText(adm.getFp().getFname(), "Mohammad");
		sendText(adm.getFp().getLname(), "Sultan");
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
