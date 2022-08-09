package org.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Automation_Practise_Home;
import com.pom.Automation_Practise_ShoppingCart;
import com.pom.Automation_Practise_Tshirt;

public class Automation_Practise_Manager {
	public static WebDriver driver;
	private Automation_Practise_Home hp;
	private Automation_Practise_Tshirt tshirt;
	private Automation_Practise_ShoppingCart cart;
	
	
	
	public Automation_Practise_Manager(WebDriver driver2) {
		this.driver = driver2;
	}
	public Automation_Practise_Home getHp() {
		hp = new Automation_Practise_Home(driver);
		return hp;
	}
	public Automation_Practise_Tshirt getTshirt() {
		tshirt = new Automation_Practise_Tshirt (driver);
		return tshirt;
	}
	public Automation_Practise_ShoppingCart getCart() {
		cart = new Automation_Practise_ShoppingCart(driver);
		return cart;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
