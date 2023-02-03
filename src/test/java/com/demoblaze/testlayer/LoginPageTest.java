package com.demoblaze.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.demoblaze.testbase.TestBase;

public class LoginPageTest extends TestBase {
	@Test
	public void verifyLoginTest() throws InterruptedException {

		home_page.clickOnLogIn_Link();
		login_page.enterUserName(read_data.readData("Login Details", 1, 0));
		login_page.enterPassword(read_data.readData("Login Details", 1, 1));
		login_page.clickOnSigninButton();

		Thread.sleep(5000);
		logger.info("User Logged into the demo Blaze Application");
		String Expected_Result = "Welcome testacc3";
		String Actual_Output = login_page.loginStatus();

		Assert.assertEquals(Actual_Output, Expected_Result);

	}

}
