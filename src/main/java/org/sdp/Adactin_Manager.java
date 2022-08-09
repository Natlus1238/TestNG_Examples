package org.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Adactin_Final_Page;
import com.pom.Adactin_Login;
import com.pom.Adactin_Search_Hotel;
import com.pom.Adactin_Selected_Hotel_Cost;

public class Adactin_Manager {
	public static WebDriver driver;
	private Adactin_Final_Page fp;
	private Adactin_Login lp;
	private Adactin_Search_Hotel sh;
	private Adactin_Selected_Hotel_Cost selhc;
	
	
	public Adactin_Manager(WebDriver driver2) {
		this.driver = driver2;
	}
	public Adactin_Final_Page getFp() {
		fp = new Adactin_Final_Page(driver);
		return fp;
	}
	public Adactin_Login getLp() {
		lp = new Adactin_Login(driver);
		return lp;
	}
	public Adactin_Search_Hotel getSh() {
		sh = new Adactin_Search_Hotel(driver);
		return sh;
	}
	public Adactin_Selected_Hotel_Cost getSelhc() {
		selhc = new Adactin_Selected_Hotel_Cost(driver);
		return selhc;
	}
	
	
	
	
}
