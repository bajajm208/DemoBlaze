package com.demoblaze.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblaze.testbase.TestBase;

public class UserDetailsPage extends TestBase {

	public UserDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	// ----------------------object Repositry---------

	@FindBy(xpath = "//input[@id='name']")
	private WebElement name_textbox;

	@FindBy(xpath = "//input[@id='country']")
	private WebElement country_textbox;

	@FindBy(xpath = "//input[@id='city']")
	private WebElement city_textbox;

	@FindBy(xpath = "//input[@id='card']")
	private WebElement credit_card_textbox;

	@FindBy(xpath = "//input[@id='month']")
	private WebElement month_textbox;

	@FindBy(xpath = "//input[@id='year']")
	private WebElement year_textbox;

	@FindBy(xpath = "//button[contains(text(),'Purchase')]")
	private WebElement purchase_button;
	
	@FindBy(xpath = "//h2[contains(text(),'Thank you for your purchase!')]")
	private WebElement conformation_msg;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
    private WebElement ok_button;
	
	// ------------------Methods Action----------------

	public void enterName_Textbox(String name) {
		name_textbox.sendKeys(name);
	}

	public void enterCountry_Textbox(String country) {
		country_textbox.sendKeys(country);
	}

	public void enterCity_Textbox(String city) {
		city_textbox.sendKeys(city);
	}

	public void enterCreditCard_Textbox(String card) {
		credit_card_textbox.sendKeys(card);
	}

	public void enterMonth_Textbox(String month) {
		month_textbox.sendKeys(month);
	}

	public void enterYear_Textbox(String year) {
		year_textbox.sendKeys(year);
	}

	public void clickOn_Purchase_Button() {
		purchase_button.click();
	}
	
	public String varifyConformation_Status() {
		String status = conformation_msg.getText();
		return status;	
	}
	
	public void clickOn_Ok_Button() {
		ok_button.click();
	}
}
