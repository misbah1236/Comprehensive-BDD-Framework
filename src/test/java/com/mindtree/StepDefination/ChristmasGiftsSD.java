package com.mindtree.StepDefination;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.ChristmasGifts;
import com.mindtree.reusableComponent.Base;
import com.mindtree.utilities.ExtentLogUtilities;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class ChristmasGiftsSD extends Base {
	public WebDriver driver;
	public ChristmasGifts thisGift;
	public ChristmasGiftsSD() throws UtilityException, Exception {
		super();
		
	}

	@Before("@Christmas")
	public void intializer() throws Exception {
		driver=initialize();
		test = report.startTest("Christmas Page");
		log = Logger.getLogger(ChristmasGiftsSD.class.getName());
		thisGift = new ChristmasGifts(driver,log,test);

	}
	
	@Given("Open Big Small Website {string} for Christmas Gifts")
	public void open_big_small_website_for_christmas_gifts(String string) throws IOException {
		driver.get(string);
		driver.manage().window().maximize();
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	}

	@Then("Click on Christmas Gift section")
	public void click_on_christmas_gift_section() throws ReusableComponentException, Exception {
		thisGift.christmasButton();
	   
	}

	@Then("Click on Socks items")
	public void click_on_socks_items() throws ReusableComponentException, Exception {
	    thisGift.socksitem();
	}

	@Then("select Quantity for socks")
	public void select_quantity_for_socks() throws ReusableComponentException, Exception {
	thisGift.quantity();
	}

	@Then("Click on Add to Cart Button for socks")
	public void click_on_add_to_cart_button_for_socks() throws ReusableComponentException, Exception {
	    thisGift.cart();
	}

	@Then("If cart page is Displayed Close it for christmas gifts")
	public void if_cart_page_is_displayed_close_it_for_christmas_gifts() throws ReusableComponentException, Exception {
	    thisGift.cartPageHandle();
	}
	
	@After("@Christmas")
	public void destroy() {
		report.endTest(test);
		report.flush();
		driver.quit();
			
		}
	

}
