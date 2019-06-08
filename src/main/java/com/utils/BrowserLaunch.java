package com.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.sdp.auto.HomePage;

public class BrowserLaunch {
	public static ExtentTest test;
	public static ExtentReports report;

	
	public static  void reports() throws FileNotFoundException {
		report = new ExtentReports(System.getProperty("user.dir") + "\\SDPPortalReport.html", true);
		test = report.startTest("SDP_Portal Cases");
		test.log(LogStatus.PASS, "File Created for Report Successfully ");
	}
	
	public static void setup()  {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size=1440,800");
		options.addArguments("headless");
		// Check if parameter passed from TestNG is 'firefox'
		// if (browser.equalsIgnoreCase("firefox")) {
		// create firefox instance
		// System.setProperty("webdriver.firefox.driver", Constants.FdriverLocation);
		// Constants.driver = new FirefoxDriver();
		// }
		// Check if parameter passed as 'chrome'
		// else if (browser.equalsIgnoreCase("chrome")) {
		// set path to chromedriver.exe */
		System.setProperty("webdriver.chrome.driver", Constants.Cdriverlocation);
		// create chrome instance
		Constants.driver = new ChromeDriver(options);
		Constants.driver.manage().window().maximize();
		Constants.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Constants.driver.manage().timeouts().pageLoadTimeout(10000,
		// TimeUnit.MILLISECONDS);
		test.log(LogStatus.PASS, "Browser Launched Successfully");
	}

}
