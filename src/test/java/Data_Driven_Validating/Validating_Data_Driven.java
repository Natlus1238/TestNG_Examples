package Data_Driven_Validating;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validating_Data_Driven extends Base_Class {

	@Test
	public void Data_Driven_Testing() throws IOException, AWTException {
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Robot r = new Robot();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text() = '✕']")).click();
		
	WebElement searchbox = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	for (int i = 0; i < 15; i++) {
		sendText(searchbox, getValuesfromExcel("Validating", "Sheet1", i, 0));
		System.out.println(searchbox.getAttribute("value"));
		assertEquals(searchbox.getAttribute("value"), getValuesfromExcel("Validating", "Sheet1", i , 0));
		searchbox.click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
	}
	

	}

}
