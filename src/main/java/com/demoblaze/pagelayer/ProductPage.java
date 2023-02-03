package com.demoblaze.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblaze.testbase.TestBase;

public class ProductPage extends TestBase {

	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

	// ----------------- Obj repositry --------------------------
	@FindBy(xpath = "//a[contains(text(),'Add to cart')]")
	private WebElement add_to_cart_button;

	@FindBy(xpath = "//a[@id='cartur']")
	private WebElement cart_link;

	// ---------------- Action methods ---------------------

	public void clickOn_Add_To_Cart_Button() {

		add_to_cart_button.click();
	}

	public void clickOn_Cart_Link() {
		cart_link.click();
	}
}
