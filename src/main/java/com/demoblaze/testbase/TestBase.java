package com.demoblaze.testbase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.demoblaze.pagelayer.CartPage;
import com.demoblaze.pagelayer.HomePage;
import com.demoblaze.pagelayer.LoginPage;
import com.demoblaze.pagelayer.ProductPage;
import com.demoblaze.pagelayer.UserDetailsPage;
import com.demoblaze.utilities.ReadConfig;
import com.demoblaze.utilities.ReadExcle;
import com.demoblaze.utilities.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public LoginPage login_page;
	public HomePage home_page;
	public ProductPage product_page;
	public CartPage cart_page;
	public UtilClass util_class;
	public UserDetailsPage user_details;
	public ReadConfig read_config_obj;
	public static Logger logger; // object create of Logger class
	public ReadExcle read_data; // Create object of ReadExcle class

	@BeforeClass
	public void start() {
		logger = Logger.getLogger("DemoBlaze Automation FrameWork");
		PropertyConfigurator.configure("Log4jfile.properties");

		logger.info("FrameWork execution start"); // info method used for print the information
	}

	@AfterClass
	public void stop() {
		logger.info("FrameWork execution stopped");
	}

	@Parameters("browser")
	@BeforeMethod
	public void setUp(String br) { // br = chrome or firefox

		if (br.equalsIgnoreCase("chrome")) {
			// setUp() is use to interconnect the Eclips with browser
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (br.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (br.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("Please provide current browser name");
		}

		read_config_obj = new ReadConfig();
		driver.get(read_config_obj.getApplicationUrl()); // Call ReadConfig class methods
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		logger.info("Browser launch, Maximize, Waits");

		// -------------Object Creation--------------

		login_page = new LoginPage();
		home_page = new HomePage();
		product_page = new ProductPage();
		cart_page = new CartPage();
		util_class = new UtilClass();
		user_details = new UserDetailsPage();
		logger.info("Object creation");
		read_data = new ReadExcle();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		logger.info("Browser closed");
	}
}
