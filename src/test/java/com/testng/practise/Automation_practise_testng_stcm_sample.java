package com.testng.practise;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.sdp.Automation_Practise_Manager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;

public class Automation_practise_testng_stcm_sample extends Base_Class {
	public static WebDriver driver = Base_Class.gettingBrowser("chrome");
	public static Automation_Practise_Manager apm = new Automation_Practise_Manager(driver);

	@BeforeClass
	private void openingurl() {
		waitimplicit();
		gettingurl("http://automationpractice.com/index.php");

	}

	@BeforeMethod
	private void signingin() throws InterruptedException {
		waitimplicit();
		clickOnElement(apm.getHp().getSignin());
		sendText(apm.getCart().getEmail(), "amsat1238@gmail.com");
		sendText(apm.getCart().getPassword(), "Pass@123");
		clickOnElement(apm.getCart().getSubmit());
	}

	@Test
	private void purchase_tshirt() {
		waitimplicit();
		action_functions(apm.getHp().getWomen(), "mouse over");
		clickOnElement(apm.getHp().getTshirt());
		scroll_using_webelement_up_down(apm.getTshirt().getAddcart());
		action_functions(apm.getTshirt().getMouseoveraddcart(), "mouse over");
		clickOnElement(apm.getTshirt().getAddcart());
		javascriptclicking(apm.getTshirt().getProceed());
		refresh();
		javascriptclicking(apm.getCart().getProceed2());
		clickOnElement(apm.getCart().getProceedsubmit());
		clickOnElement(apm.getCart().getCheckagreement());
		clickOnElement(apm.getCart().getProceed3());

	}

	@AfterMethod
	private void signingout() throws IOException {

		taking_screenshot("finalimage");
		clickOnElement(apm.getCart().getSignout());

	}

	@AfterClass
	private void closing_browser() {
		closebrowser();

	}

}
