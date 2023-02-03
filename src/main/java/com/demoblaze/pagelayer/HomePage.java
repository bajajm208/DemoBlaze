package com.demoblaze.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoblaze.testbase.TestBase;

public class HomePage extends TestBase {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// ----------------- Obj repositry --------------------------

	@FindBy(xpath = "//a[@id='login2']")
	private WebElement login_link;

	@FindBy(xpath = "//a[contains(text(),'Phones')]")
	private WebElement phone_link;

	@FindBy(xpath = "//a[contains(text(),'Samsung galaxy s6')]")
	private WebElement samsung_galaxy_s6_link;

	// ---------------- Action methods ---------------------

	public void clickOnLogIn_Link() {
		login_link.click();
	}

	public void clickOnPhone_Link() {
		phone_link.click();

	}

	public void clickOnSamsung_Galaxy_s6_Link() {
		samsung_galaxy_s6_link.click();
	}

}
