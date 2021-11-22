package com.mindtree.StepDefination;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.CorporateGifts;
import com.mindtree.reusableComponent.Base;
import com.mindtree.utilities.ExtentLogUtilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class CorporateGiftsSD extends Base {
	public WebDriver driver;
	public CorporateGifts thisGift;
	
	public CorporateGiftsSD() throws UtilityException, Exception {
		super();
		
	}
	
	@Before("@Corporate")
	public void initializer() throws Exception {
		driver=initialize();
		log = Logger.getLogger(CorporateGiftsSD.class.getName());
		thisGift = new CorporateGifts(driver,log,test);
	}
	@Given("Open Big Small Website {string} for corporate Gifts")
	public void open_big_small_website_for_corporate_gifts(String string) throws IOException {
		test = report.startTest("corporate gift Page");
		driver.get(string);
		driver.manage().window().maximize();
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	}
	@Then("Click on Corporate Gift section")
	public void click_on_corporate_gift_section() throws ReusableComponentException, Exception {
            thisGift.corporateButton();
	}
	@Then("Add {string} {string} {string} in the form")
	public void add_in_the_form(String string, String string2, String string3) throws ReusableComponentException, Exception {
	  thisGift.addDetails(string, string2, string3);
	}
	@Then("click on Submit Button")
	public void click_on_submit_button() throws ReusableComponentException, Exception {
	    thisGift.submit();
	}
	@After("@Corporate")
	public void destroy() {
		report.endTest(test);
		report.flush();
		driver.quit();
			
		}

}
