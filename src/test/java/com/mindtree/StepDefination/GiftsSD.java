package com.mindtree.StepDefination;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.exceptions.UtilityException;
import com.mindtree.pageObject.Gifts;
import com.mindtree.reusableComponent.Base;
import com.mindtree.utilities.ExtentLogUtilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GiftsSD extends Base  {

	public WebDriver driver;
	public Gifts thisGift;

	public GiftsSD() throws UtilityException, Exception {
		super();
	}

	@Before("@GiftsDropdown")
	public void initializer() throws Exception {
		driver = initialize();
		log = Logger.getLogger(GiftsSD.class.getName());
		thisGift = new Gifts(driver, log, test);
	}

	@Given("^Open Big Small Website \"([^\"]*)\" for Gifts$")
	public void open_big_small_website_something_for_gifts(String url) throws Throwable {
		test = report.startTest("gift dropdown Page");
		driver.get(url);
		driver.manage().window().maximize();
		ExtentLogUtilities.pass(driver, test, "URL Opened", log);
	}
		
	@Then("Click on  Gift drop down section")
	public void click_on_gift_drop_down_section() {
	   thisGift.giftsddropdown();
	}
	@Then("Select {string} from dropdown from gifts menu")
	public void select_from_dropdown_from_gifts_menu(String string) throws ReusableComponentException, Exception {
	  thisGift.selectType(string);
	}
	@Then("select {string} of your choice from dropdown")
	public void select_of_your_choice_from_dropdown(String string) throws ReusableComponentException, Exception {
	    thisGift.selectitem(string);
	}
	@Then("Select {string} and add to cart for gift")
	public void select_and_add_to_cart_for_gift(String string) throws ReusableComponentException, Exception {
	    thisGift.quantity(string);
	}
	@Then("If cart page is Displayed Close it from gift page")
	public void if_cart_page_is_displayed_close_it_from_gift_page() throws ReusableComponentException, Exception {
	   thisGift.handleCart();
	}
	@After("@GiftsDropdown")
	public void destroy() {
		report.endTest(test);
		report.flush();
		driver.quit();
			
		}

	

}
