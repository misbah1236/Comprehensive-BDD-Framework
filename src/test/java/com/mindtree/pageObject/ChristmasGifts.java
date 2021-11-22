package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.reusableComponent.WebDriverSupport;
import com.mindtree.uiStore.ChristmasGiftsUi;
import com.relevantcodes.extentreports.ExtentTest;

public class ChristmasGifts extends ChristmasGiftsUi{
	WebDriver driver;
	Logger log;
	ExtentTest test;
	
	public ChristmasGifts(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}
	
	public void christmasButton() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, christmanButton, " Home page", "christmas gifts button", log, test);
		Thread.sleep(2000);
	}
	public void socksitem() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, socks, " christmas gifts", "socks button", log, test);
		Thread.sleep(2000);
	}
	public void quantity() throws ReusableComponentException, Exception {
		driver.findElement(quantity).clear();
		WebDriverSupport.sendKeys(driver, quantity, "socks page", "quantity button ", log, test, "2");
		Thread.sleep(2000);
	}
	public void cart() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, cart, "socks page", "cart button", log, test);
		Thread.sleep(2000);
	}
	public void cartPageHandle() throws ReusableComponentException, Exception {
		if(driver.findElement(formCart).isDisplayed())
		{
			WebDriverSupport.click(driver,close,"Cart Page","Close Button", log, test);
		}
		WebDriverSupport.click(driver, getHome,"home page", "home button", log, test);
		Thread.sleep(2000);
	}

	

}
