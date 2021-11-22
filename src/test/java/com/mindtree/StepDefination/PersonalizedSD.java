package com.mindtree.StepDefination;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.PersonalizedGifts;
import com.mindtree.reusableComponent.Base;
import com.mindtree.utilities.ExtentLogUtilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class PersonalizedSD extends Base {
	public PersonalizedSD() throws UtilityException, Exception {
		super();

	}
	public WebDriver driver;
	public PersonalizedGifts thisGift;
	
	@Before("@Personalized")
	public void initializer() throws Exception {
		driver=initialize();
		log = Logger.getLogger(PersonalizedSD.class.getName());
		thisGift = new PersonalizedGifts(driver,log,test);
	}
	
	@Given("Open Big Small Website {string} for personalized gifts")
	public void open_big_small_website_for_personalized_gifts(String string) throws IOException {
		test = report.startTest("personalized Page");
		driver.get(string);
		driver.manage().window().maximize();
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	}
	@Then("Click on Peronalized Gift section")
	public void click_on_peronalized_gift_section() throws ReusableComponentException, Exception {
	    thisGift.personalizedButton();
	}
	@Then("Click on Personalized Name Glass Bottle")
	public void click_on_personalized_name_glass_bottle() throws ReusableComponentException, Exception {
		thisGift.glassBottle();
	}
	@Then("select {string} and add customised Name")
	public void select_quantity_and_add_customised_name(String string) throws ReusableComponentException, Exception {
		thisGift.quantityName(string);
	}
	@Then("Click on Add to Cart Button from glass bottle page")
	public void click_on_add_to_cart_button_from_glass_bottle_page() throws ReusableComponentException, Exception {
	    thisGift.cart();
	}
	@Then("If cart page is Displayed Close it from personalized gifts")
	public void if_cart_page_is_displayed_close_it_from_personalized_gifts() throws ReusableComponentException, Exception {
	   thisGift.handleCart();
	}
	@After("@Personalized")
	public void destroy() {
		report.endTest(test);
		report.flush();
		driver.quit();
	}
			

}
