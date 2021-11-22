package com.mindtree.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.reusableComponent.WebDriverSupport;
import com.mindtree.uiStore.CorporateGiftsUi;
import com.relevantcodes.extentreports.ExtentTest;

public class CorporateGifts extends CorporateGiftsUi{


	WebDriver driver;
	Logger log;
	ExtentTest test;

	public CorporateGifts(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}
	
	public void corporateButton() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, corporateButton,"Home Page","Corporate Button", log, test);
		Thread.sleep(2000);
	}
	public void addDetails(String name,String Gmail,String phno) throws ReusableComponentException, Exception {
		WebDriverSupport.sendKeys(driver, fname, "corporate page", "name field", log, test, name);
		WebDriverSupport.sendKeys(driver,email, "corporate page", "email field", log, test, Gmail);
		WebDriverSupport.sendKeys(driver,phn, "corporate page", "phone field", log, test, phno);
		Thread.sleep(2000);
	}
	public void submit() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, submit,"Corporate Page","Submit Button", log, test);
		Thread.sleep(2000);
	}
	
	

}
