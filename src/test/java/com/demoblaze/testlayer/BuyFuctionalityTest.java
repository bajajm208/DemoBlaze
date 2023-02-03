package com.demoblaze.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.demoblaze.testbase.TestBase;

public class BuyFuctionalityTest extends TestBase {

	@Test
	public void varify_Buying_FunctionalityWithoutLogin() throws InterruptedException {

		home_page.clickOnPhone_Link();
		home_page.clickOnSamsung_Galaxy_s6_Link();
		product_page.clickOn_Add_To_Cart_Button();
		Thread.sleep(3000);
		logger.info("Product add into the cart");

		util_class.acceptAlert();
		product_page.clickOn_Cart_Link();
		cart_page.clickOn_Place_Order_Button();
		user_details.enterName_Textbox(read_data.readData("User Details", 2, 0));
		user_details.enterCountry_Textbox(read_data.readData("User Details", 2, 1));
		user_details.enterCity_Textbox(read_data.readData("User Details", 2, 2));
		user_details.enterCreditCard_Textbox(read_data.readData("User Details", 2, 3));
		user_details.enterMonth_Textbox(read_data.readData("User Details", 2, 4));
		user_details.enterYear_Textbox(read_data.readData("User Details", 2, 5));
		user_details.clickOn_Purchase_Button();
		logger.info("Product placed successfuly");

		String Expected_Result = "Thank you for your purchase!";
		String Actual_Result = user_details.varifyConformation_Status();
		Assert.assertEquals(Actual_Result, Expected_Result);
		user_details.clickOn_Ok_Button();

	}

	@Test
	public void varify_Buying_FunctionalityWithLogin() throws InterruptedException {

		home_page.clickOnLogIn_Link();
		login_page.enterUserName("testacc3");
		login_page.enterPassword("test");
		login_page.clickOnSigninButton();
		Thread.sleep(3000);
		home_page.clickOnPhone_Link();
		home_page.clickOnSamsung_Galaxy_s6_Link();
		product_page.clickOn_Add_To_Cart_Button();
		Thread.sleep(3000);
		logger.info("Product add into the cart");
		util_class.acceptAlert();
		product_page.clickOn_Cart_Link();
		cart_page.clickOn_Place_Order_Button();
		user_details.enterName_Textbox("Ankit");
		user_details.enterCountry_Textbox("India");
		user_details.enterCity_Textbox("Pune");
		user_details.enterCreditCard_Textbox("957534333");
		user_details.enterMonth_Textbox("09");
		user_details.enterYear_Textbox("2022");
		user_details.clickOn_Purchase_Button();
		logger.info("Product placed successfuly");
		String Expected_Result = "Thank you for your purchase!";
		String Actual_Result = user_details.varifyConformation_Status();
		Assert.assertEquals(Actual_Result, Expected_Result);
		user_details.clickOn_Ok_Button();

	}

}
