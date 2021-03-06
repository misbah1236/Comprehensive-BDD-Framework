package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.reusableComponent.WebDriverSupport;
import com.mindtree.uiStore.SecretSantaUi;
import com.relevantcodes.extentreports.ExtentTest;

public class SecretSanta extends SecretSantaUi{
	WebDriver driver;
	Logger log;
	ExtentTest test;
	
	public SecretSanta(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}
	public void secretsantaButton() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, secretsantaButton, " Home page", "secretsanta button", log, test);
		Thread.sleep(2000);
	}
	public void tissue() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, tissuebox, " secretsanta page", "tissue box ", log, test);
		Thread.sleep(2000);
	}
	public void quantity() throws ReusableComponentException, Exception {
		driver.findElement(quantity).clear();
		WebDriverSupport.sendKeys(driver, quantity, "tissue page", " cart button", log, test, "7");
		Thread.sleep(2000);
	}
	public void cart() throws ReusableComponentException, Exception {

		WebDriverSupport.click(driver, cart, "socks page", "cart button", log, test);
		Thread.sleep(2000);
	}
	public void handleCart() throws ReusableComponentException, Exception {
		if(driver.findElement(formCart).isDisplayed())
		{
			WebDriverSupport.click(driver,close,"Cart Page","Close Button", log, test);
		}
		WebDriverSupport.click(driver, getHome,"home page", "home button", log, test);
		Thread.sleep(2000);
	}
	
	

}
