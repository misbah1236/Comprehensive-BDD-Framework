package com.mindtree.pageObject;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.exceptions.ReusableComponentException;
import com.mindtree.reusableComponent.WebDriverSupport;
import com.mindtree.uiStore.WhatsNewUi;
import com.relevantcodes.extentreports.ExtentTest;
public class WhatsNew extends WhatsNewUi{
	WebDriver driver;
	Logger log;
	ExtentTest test;

	public WhatsNew(WebDriver driver, Logger log, ExtentTest test) throws Exception {
		this.driver = driver;
		this.test = test;
		this.log = log;
	}
	
	public void whatsnewButton() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, whatsnewButton,"Home page","Personalize Gift button", log, test);
		Thread.sleep(2000);
	}
	public void selectProduct(String item) throws ReusableComponentException, Exception {
		List<WebElement>listRec=driver.findElements(result);
		for(WebElement temp:listRec)
		{
			if(temp.getText().equalsIgnoreCase(item))
			{
				WebDriverSupport.clickByWebElement(driver, temp,"result page",item, log, test);
				break;
			}
		}
		Thread.sleep(2000);
	}
	public void quantity(String quant) throws ReusableComponentException, Exception {
		driver.findElement(quantity).clear();
		WebDriverSupport.sendKeys(driver,quantity,"Cart Page","Quantity Field", log, test, quant);
		Thread.sleep(2000);
	}
	public void cart() throws ReusableComponentException, Exception {
		WebDriverSupport.click(driver, cart,"Cart page", "Add to cart", log, test);
		Thread.sleep(2000);
	}
	public void handleCart() throws ReusableComponentException, Exception{
		if(driver.findElement(formCart).isDisplayed())
		{
			WebDriverSupport.click(driver,close,"Cart Page","Close Button", log, test);
		}
		WebDriverSupport.click(driver,getHome,"cart","Bigsmall pic", log, test);
		Thread.sleep(2000);
		}
	
}
