package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class NewYearUi {
	
	public static By newyearButton = By.xpath("//a[contains(text(),'New Years 2022')]");
	public static By result = By.cssSelector("div.grid-product__title");
	public static By quantity = By.xpath("//input[@id='quantity']");
	public static By cart =By.xpath("//button[@name='add']");
	public static By getHome=By.cssSelector("img.small--hide");
	public static By formCart=By.cssSelector("form.drawer__contents.cart.ajaxcart");
	public static By close=By.cssSelector("button.drawer__close-button.js-drawer-close");
}
