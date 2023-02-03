package com.demoblaze.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblaze.testbase.TestBase;

public class CartPage extends TestBase {
	
	public CartPage(){
		PageFactory.initElements(driver,this);
	}
	
	//----------------- Obj repositry --------------------------
	@FindBy(xpath = "//button[contains(text(),'Place Order')]")
	private WebElement place_order_button;
	
	//---------------- Action methods ---------------------
	public void clickOn_Place_Order_Button() {
		place_order_button.click();
	}
	
}
