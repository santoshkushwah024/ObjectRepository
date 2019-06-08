package com.sdp.auto;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.utils.BrowserLaunch;
import com.utils.Constants;

public class HomePage {
	public static String login;

	public static void frame() {

		Constants.driver.switchTo().frame("indexFrame");
	}

	
	public static void homePage() throws IOException {

		// Open the Home Page For Super admin
		if (Constants.prop1.getProperty("PORTAL").equals("1")) {
			Constants.driver.get(Constants.prop.getProperty("S_ADMIN_URL"));
		} else if (Constants.prop1.getProperty("PORTAL").equals("2")) {
			Constants.driver.get(Constants.prop.getProperty("A_ADMIN_URL"));
		} else {
			System.out.println("No Configuration is Set at Portal Url");
		}
		BrowserLaunch.test.log(LogStatus.PASS, "Get Url Successfully");
		frame();
	}

	public static void login() throws Exception {
		// Super Admin Login Code
		if (Constants.prop1.getProperty("LOGIN").equals("1")) {
			Thread.sleep(2000);
		//	frame();
		//	Constants.driver.findElement(By.xpath(Constants.prop.getProperty("Login"))).click();
			Constants.driver.findElement(By.xpath(Constants.prop.getProperty("UserName")))
					.sendKeys(Constants.prop1.getProperty("S_USER_NAME"));
			Constants.driver.findElement(By.name(Constants.prop.getProperty("PASSWORD")))
					.sendKeys(Constants.prop1.getProperty("S_PASSWORD"));
			//Constants.driver.findElement(By.name("password")).sendKeys("dna");
			Constants.driver.findElement(By.xpath(Constants.prop.getProperty("SUBMIT"))).click();
			login = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("TITLE"))).getText();
			Assert.assertEquals(login, "Welcome : dna(Super User) ");
			if (login.equalsIgnoreCase("Welcome : dna(Super User) ")) {
				System.out.println(login + " : " + "SuperAdmin Logged in successfully");
				BrowserLaunch.test.log(LogStatus.PASS, "Super Admin Logged in successfully");
			} else {
				BrowserLaunch.test.log(LogStatus.FAIL, "INVALID USER NAME OR PASSWORD");
				Constants.driver.switchTo().alert().accept();
			}
			Thread.sleep(1000);
			Constants.driver.findElement(By.xpath("//a[contains(@href,'sdphomepage.jsp')]")).click();
			BrowserLaunch.test.log(LogStatus.PASS, "Home page is Clicked successfull ");

		}
		// Admin Login Code
		else if (Constants.prop1.getProperty("LOGIN").equals("2")) {
			Thread.sleep(2000);
			frame();
			// Constants.driver.findElement(By.xpath(Constants.prop.getProperty("A_Login"))).click();
			Constants.driver.findElement(By.xpath(Constants.prop.getProperty("A_UserName")))
					.sendKeys(Constants.prop1.getProperty("A_USER_NAME"));
			Constants.driver.findElement(By.xpath(Constants.prop.getProperty("A_PASSWORD")))
					.sendKeys(Constants.prop1.getProperty("A_PASS_WORD"));
			Constants.driver.findElement(By.xpath(Constants.prop.getProperty("A_SUBMIT"))).click();

			login = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("A_TITLE"))).getText();
			Assert.assertEquals(login, "Welcome : admin2(Admin) ");
			if (login.equalsIgnoreCase("Welcome : admin2(Admin) ")) {
				System.out.println(login + " : " + "Admin Logged in successfully");
				BrowserLaunch.test.log(LogStatus.PASS, "Admin Logged in successfully");
			} else {
				BrowserLaunch.test.log(LogStatus.FAIL, "INVALID USER NAME OR PASSWORD");
				Constants.driver.switchTo().alert().accept();
			}

			Constants.driver.findElement(By.xpath("//a[contains(@href,'sdphomepage.jsp')]")).click();
			// BrowserLaunch.test.log(LogStatus.PASS, "Home page is Clicked successfull ");
		} else {
			System.out.println("No Configuration is Set at Login");
		}
	}

	// LOGOUT Method for User Logged in
	public static void logout() throws Exception {
		if (Constants.prop1.getProperty("G_LOGOUT").equals("1")) {
			Thread.sleep(2000);
			// frame();
			Constants.driver.findElement(By.xpath(Constants.prop.getProperty("LOGOUT"))).click();
			System.out.println("Super Admin Logged out successfully");
			BrowserLaunch.test.log(LogStatus.PASS, "Logged out successfull ");
		} else if (Constants.prop1.getProperty("G_LOGOUT").equals("2")) {
			Constants.driver.findElement(By.xpath(Constants.prop.getProperty("A_LOGOUT"))).click();
			System.out.println(" Admin Logged out successfully");

		} else {
			System.out.println("No Configuration is Set Logout");
		}

	}

}
