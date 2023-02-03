package com.demoblaze.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.demoblaze.testbase.TestBase;

public class UtilClass extends TestBase {

	public UtilClass() {
		PageFactory.initElements(driver, this);
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public static void takeScreenshot(String fileName) { 
		String path = "E:\\VelocityWorkSpace\\DemoBlaze\\screenshots\\" + System.currentTimeMillis();
		
		try {
			File src = new File(path + fileName + ".png");
			File img = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(img, src);
		} 
		catch (IOException e) {
			System.out.print("File not found : Please provide correct path");
			e.printStackTrace();
		}
	}
}
