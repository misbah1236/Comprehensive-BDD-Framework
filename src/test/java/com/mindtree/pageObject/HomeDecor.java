package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.reusableComponent.WebDriverSupport;
import com.mindtree.uiStore.HomeDecorUi;
import com.relevantcodes.extentreports.ExtentTest;

public class HomeDecor extends HomeDecorUi{
	WebDriver driver;
	Logger log;
	ExtentTest test;
	
	public HomeDecor(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}
	
	public void homedecorButton() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, HomeDecorButton, " Home page", "Home decor button", log, test);
		Thread.sleep(2000);
	}
	
	public void addlamp() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, lamp, "home decor page", " lamp button", log, test);
		Thread.sleep(2000);
	}
	public void quantity() throws ReusableComponentException, Exception {
		driver.findElement(quantity).clear();
		WebDriverSupport.sendKeys(driver, quantity, "lamp page", "quantity button", log, test, "3");
		Thread.sleep(2000);
	}
	public void cart() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, cart, "lamp page", "cart button", log, test);
		Thread.sleep(2000);
	}
	public void handlecart() throws ReusableComponentException, Exception {

		if(driver.findElement(formCart).isDisplayed())
		{
			WebDriverSupport.click(driver,close,"Cart Page","Close Button", log, test);
		}
		WebDriverSupport.click(driver, getHome,"home page", "home button", log, test);
		Thread.sleep(2000);
	}
	


}
