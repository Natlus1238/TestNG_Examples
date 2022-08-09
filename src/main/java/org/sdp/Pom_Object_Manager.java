package org.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Home_page;
import com.pom.SignUp_Page;
import com.pom.Verifynum;

public class Pom_Object_Manager {
	public static WebDriver driver;
	private Home_page hp;
	private SignUp_Page sp;
	private Verifynum vp;
	

	
	public Pom_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}



	public Home_page getHp() {
		hp = new Home_page(driver);
		return hp;
	}



	public SignUp_Page getSp() {
		sp = new SignUp_Page(driver);
		return sp;
	}



	public Verifynum getVp() {
		vp = new Verifynum(driver);
		return vp;
	}

	

}
