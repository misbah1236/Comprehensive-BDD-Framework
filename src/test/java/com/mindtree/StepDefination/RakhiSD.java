package com.mindtree.StepDefination;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.Rakhi;
import com.mindtree.reusableComponent.Base;
import com.mindtree.utilities.ExtentLogUtilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class RakhiSD extends Base{
	public WebDriver driver;
	public Rakhi thisGift;
	public RakhiSD() throws UtilityException, Exception {
		super();
	}

	@Before("@rakhi")
	public void initializer() throws Exception {
		driver = initialize();
		log = Logger.getLogger(RakhiSD.class.getName());
		thisGift = new Rakhi(driver, log, test);
	}

	@Given("Open Big Small Website {string} for rakhi page")
	public void open_big_small_website_for_rakhi_page(String string) throws IOException {
		test = report.startTest("rakhi gift Page");
		driver.get(string);
		driver.manage().window().maximize();
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	}
	@Then("click rakhi Gift section")
	public void click_rakhi_gift_section() throws ReusableComponentException, Exception {
	    thisGift.rakhiButton();
	}
	@Then("Click on {string} from list of products on rakhi gift page")
	public void click_on_from_list_of_products_on_rakhi_gift_page(String string) throws ReusableComponentException, Exception {
	    thisGift.selectProduct(string);
	}
	@Then("select {string} of product you have selected from rakhi gift page")
	public void select_of_product_you_have_selected_from_rakhi_gift_page(String string) throws ReusableComponentException, Exception {
	    thisGift.quantity(string);
	}
	@Then("Click on Add to Cart Button from rakhi gift page")
	public void click_on_add_to_cart_button_from_rakhi_gift_page() throws ReusableComponentException, Exception {
	  thisGift.cart();
	}
	@Then("If cart page is Displayed Close it from rakhi gift page")
	public void if_cart_page_is_displayed_close_it_from_rakhi_gift_page() throws ReusableComponentException, Exception {
	    thisGift.handleCart();
	}
	@After("@rakhi")
	public void destroy() {
		report.endTest(test);
		report.flush();
		driver.quit();		
		}

}
