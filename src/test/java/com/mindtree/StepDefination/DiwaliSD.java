package com.mindtree.StepDefination;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.DiwaliGift;
import com.mindtree.reusableComponent.Base;
import com.mindtree.utilities.ExtentLogUtilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class DiwaliSD extends Base {
	public WebDriver driver;
	public DiwaliGift thisGift;
	public DiwaliSD() throws UtilityException, Exception {
		super();
	}

	@Before("@diwali")
	public void initializer() throws Exception {
		driver = initialize();
		log = Logger.getLogger(DiwaliSD.class.getName());
		thisGift = new DiwaliGift(driver, log, test);
	}
	
	@Given("Open Big Small Website {string} for diwali page")
	public void open_big_small_website_for_what_s_new_page(String string) throws IOException {
		test = report.startTest("diwali Page");
		driver.get(string);
		driver.manage().window().maximize();
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	}
	@Then("click diwali Gift section")
	public void click_diwali_gift_section() throws ReusableComponentException, Exception {
	    thisGift.diwalibutton();
	}
	@Then("Click on {string} from list of products on diwali gift page")
	public void click_on_from_list_of_products_on_diwali_gift_page(String string) throws ReusableComponentException, Exception {
	   thisGift.selectProduct(string);
	}
	@Then("select {string} of product you have selected from diwlai gift page")
	public void select_of_product_you_have_selected_from_diwlai_gift_page(String string) throws ReusableComponentException, Exception {
	  thisGift.quantity(string);
	}
	@Then("Click on Add to Cart Button from diwail gift page")
	public void click_on_add_to_cart_button_from_diwail_gift_page() throws ReusableComponentException, Exception {
	    thisGift.cart();
	}
	@Then("If cart page is Displayed Close it from diwali gift page")
	public void if_cart_page_is_displayed_close_it_from_diwali_gift_page() throws ReusableComponentException, Exception {
	   thisGift.handleCart();
	}
	@After("@diwali")
	public void destroy() {
		report.endTest(test);
		report.flush();
		driver.quit();		
		}

}
