package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class ChristmasGiftsUi {
	public static By christmanButton = By.xpath("//button[contains(text(),'Christmas Gifts')]");
	public static By socks = By.xpath("(//div[contains(text(),'Christmas Socks')])[1]");
	public static By quantity = By.xpath("//input[@id='quantity']");
	public static By cart =By.xpath("//button[@name='add']");
	public static By formCart=By.cssSelector("form.drawer__contents.cart.ajaxcart");
	public static By close=By.cssSelector("button.drawer__close-button.js-drawer-close");
	public static By getHome=By.cssSelector("img.small--hide");
	
}
