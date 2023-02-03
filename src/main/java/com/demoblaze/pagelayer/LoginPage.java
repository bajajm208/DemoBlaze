package com.demoblaze.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblaze.testbase.TestBase;

public class LoginPage extends TestBase{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// ----------------- Obj repository --------------------------

	@FindBy(xpath = "//input[@id='loginusername']")
	private WebElement username_textbox;

	@FindBy(xpath = "//input[@id='loginpassword']")
	private WebElement password_textbox;

	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	private WebElement login_button;

	@FindBy(xpath = "//a[@id='nameofuser']")
	private WebElement login_status_msg;
	
	
	// ---------------- Action methods ---------------------

	public void enterUserName(String username) {
		username_textbox.sendKeys(username);
	}

	public void enterPassword(String password) {
		password_textbox.sendKeys(password);
	}

	public void clickOnSigninButton() {
		login_button.click();
	}
	
	public String loginStatus() {
		String msg = login_status_msg.getText();
		return msg;
	}

}
