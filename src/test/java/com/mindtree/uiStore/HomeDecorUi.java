package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class HomeDecorUi {
          public static By HomeDecorButton = By.xpath("//button[contains(text(),'Home Decor')]");
          public static By lamp = By.xpath("//div[contains(text(),'Sunset Projection Lamp')]");
          public static By quantity = By.xpath("//input[@id='quantity']");
          public static By cart = By.xpath("//button[@name='add']");
          public static By getHome=By.cssSelector("img.small--hide");
          public static By formCart=By.cssSelector("form.drawer__contents.cart.ajaxcart");
      	public static By close=By.cssSelector("button.drawer__close-button.js-drawer-close");
      	
}
