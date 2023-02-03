package com.demoblaze.utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.demoblaze.testbase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test Case execution start");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test Case execution success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		UtilClass.takeScreenshot(result.getName());
		logger.info("Test Case execution fail");

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test Case execution skip");
	}

}
