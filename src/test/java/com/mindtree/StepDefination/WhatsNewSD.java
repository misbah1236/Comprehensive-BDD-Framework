package com.mindtree.StepDefination;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.WhatsNew;
import com.mindtree.reusableComponent.Base;
import com.mindtree.utilities.ExtentLogUtilities;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class WhatsNewSD extends Base{
	public WebDriver driver;
	public WhatsNew thisGift;
	public WhatsNewSD() throws UtilityException, Exception {
		super();
	}

	@Before("@whatsnew")
	public void initializer() throws Exception {
		driver = initialize();
		log = Logger.getLogger(WhatsNewSD.class.getName());
		thisGift = new WhatsNew(driver, log, test);
	}
	
	@Given("Open Big Small Website {string} for What'sNew page")
	public void open_big_small_website_for_what_s_new_page(String string) throws IOException {
		test = report.startTest("gift dropdown Page");
		driver.get(string);
		driver.manage().window().maximize();
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	}
	@Then("click What'sNew  Gift section")
	public void click_what_s_new_gift_section() throws ReusableComponentException, Exception {
	    thisGift.whatsnewButton();
	}
	@Then("Click on {string} from list of products on what's new page")
	public void click_on_from_list_of_products_on_what_s_new_page(String string) throws ReusableComponentException, Exception {
	    thisGift.selectProduct(string);
	}
	@Then("select {string} of product you have selected from What'snew page")
	public void select_of_product_you_have_selected_from_what_snew_page(String string) throws ReusableComponentException, Exception {
	   thisGift.quantity(string);
	}
	@Then("Click on Add to Cart Button from what'snew page")
	public void click_on_add_to_cart_button_from_what_snew_page() throws ReusableComponentException, Exception {
	  thisGift.cart();
	}
	@Then("If cart page is Displayed Close it from what'snew page")
	public void if_cart_page_is_displayed_close_it_from_what_snew_page() throws ReusableComponentException, Exception {
	    thisGift.handleCart();
	}

}
