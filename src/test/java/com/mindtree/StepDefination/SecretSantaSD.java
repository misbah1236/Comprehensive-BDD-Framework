package com.mindtree.StepDefination;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.SecretSanta;
import com.mindtree.reusableComponent.Base;
import com.mindtree.utilities.ExtentLogUtilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class SecretSantaSD extends Base {
	public WebDriver driver;
	public SecretSanta thisGift;
	public SecretSantaSD() throws UtilityException, Exception {
		super();
	}

	@Before("@SecretSanta")
	public void initializer() throws Exception {
		driver = initialize();
		log = Logger.getLogger(SecretSantaSD.class.getName());
		thisGift = new SecretSanta(driver, log, test);
	}

	@Given("Open Big Small Website {string} for secret santa")
	public void open_big_small_website_for_secret_santa(String string) throws IOException {
		test = report.startTest("Seecret santa Page");
		driver.get(string);
		driver.manage().window().maximize();
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	}

	@Then("Click on Secret Santa Gift section")
	public void click_on_secret_santa_gift_section() throws ReusableComponentException, Exception {
		thisGift.secretsantaButton();
	}

	@Then("Click on Tissue Box product")
	public void click_on_tissue_box_product() throws ReusableComponentException, Exception {
		thisGift.tissue();
	}

	@Then("select Quantity of tissue box product")
	public void select_quantity_of_tissue_box_product() throws ReusableComponentException, Exception {
		thisGift.quantity();	}

	@Then("Click on Add to Cart Button from tissue box page")
	public void click_on_add_to_cart_button_from_tissue_box_page() throws ReusableComponentException, Exception {
		thisGift.cart();
	}

	@Then("If cart page is Displayed Close it from secret santa page")
	public void if_cart_page_is_displayed_close_it_from_secret_santa_page() throws ReusableComponentException, Exception {
		thisGift.handleCart();
	}
	@After("@SecretSanta")
	public void destroy() {
		report.endTest(test);
		report.flush();
		driver.quit();
	}

}
