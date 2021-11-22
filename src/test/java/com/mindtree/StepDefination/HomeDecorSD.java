package com.mindtree.StepDefination;

import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.HomeDecor;
import com.mindtree.reusableComponent.Base;
import com.mindtree.utilities.ExtentLogUtilities;

import java.io.IOException;

import org.apache.log4j.Logger;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomeDecorSD extends Base {
	public WebDriver driver;
	public HomeDecor thisGift;
	
	public HomeDecorSD() throws UtilityException, Exception {
		super();
		
	}
	@Before("@HomeDecor")
	public void initializer() throws Exception {
		driver=initialize();
		log = Logger.getLogger(HomeDecorSD.class.getName());
		thisGift = new HomeDecor(driver,log,test);
	}
	@Given("Open Big Small Website {string} for HomeDecor")
	public void open_big_small_website_for_home_decor(String string) throws IOException {
		test = report.startTest("home decor Page");
		driver.get(string);
		driver.manage().window().maximize();
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	}
	@Then("Click on HomeDecor Gift section")
	public void click_on_home_decor_gift_section() throws ReusableComponentException, Exception {
	   thisGift.homedecorButton();
	}
	@Then("Click on Lamp item")
	public void click_on_lamp_item() throws ReusableComponentException, Exception {
		 thisGift.addlamp();
	}
	@Then("select Quantity for lamp item")
	public void select_quantity_for_lamp_item() throws ReusableComponentException, Exception {
		 thisGift.quantity();
	}
	@Then("Click on Add to Cart Button for lamp product")
	public void click_on_add_to_cart_button_for_lamp_product() throws ReusableComponentException, Exception {
		 thisGift.cart();
	}
	@Then("If cart page is Displayed Close it from HomeDecor page")
	public void if_cart_page_is_displayed_close_it_from_home_decor_page() throws ReusableComponentException, Exception {
		 thisGift.handlecart();

}
	@After("@HomeDecor")
	public void destroy() {
		report.endTest(test);
		report.flush();
		driver.quit();
			
		}
}
