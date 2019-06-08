package com.sdp.auto;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;
import com.utils.BrowserLaunch;
import com.utils.Constants;

public class UserManagement {
	public static void userManageActions() {
		// For User manageMent link
		Constants.driver.findElement(By.xpath(Constants.prop.getProperty("USERS"))).click();
		boolean b = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("USER_MGMT_LNK"))).isDisplayed();
		System.out.println("USER_Management Link is present " + b);
		String str = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("USER_MGMT_LNK"))).getText();
		Assert.assertEquals("User Management", str);
		System.out.println(str + " Expected Result");
		Constants.driver.findElement(By.xpath(Constants.prop.getProperty("USER_MGMT_LNK"))).click();
		BrowserLaunch.test.log(LogStatus.PASS, "UserManagemnet Link Is Present ");

		// For Admin Link Verification
		boolean c = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("ADMIN_LNK"))).isDisplayed();
		System.out.println("ADMIN_LNK  is present " + c);
		String str1 = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("ADMIN_LNK"))).getText();
		Assert.assertEquals("Admin", str1);
		System.out.println(str1 + " Expected Result");
		
		Constants.driver.findElement(By.xpath(Constants.prop.getProperty("ADMIN_LNK"))).click();
		BrowserLaunch.test.log(LogStatus.PASS, "Admin Link Is Present ");
		if(c==false) {
		BrowserLaunch.test.log(LogStatus.FAIL, "Admin Link Is Not Present ");
		}

		// For Asp users Verification Link
		boolean d = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("ASP_LNK"))).isDisplayed();
		System.out.println("ASP_LNK is present " + d);
		String str2 = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("ASP_LNK"))).getText();
		Assert.assertEquals("Application Service Provider", str2);
		System.out.println(str2 + " Expected Result");
		Constants.driver.findElement(By.xpath(Constants.prop.getProperty("ASP_LNK"))).click();
		BrowserLaunch.test.log(LogStatus.PASS, "Application Service Provider Link Is Present ");

		// For Content Aggretor Verification Link
		boolean e = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CONTENT_AGTR_LNK")))
				.isDisplayed();
		System.out.println("CONTENT_AGTR_LNK  is present " + e);
		String str3 = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CONTENT_AGTR_LNK"))).getText();
		Assert.assertEquals("Content Aggregator", str3);
		System.out.println(str3 + " Expected Result");
		Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CONTENT_AGTR_LNK"))).click();
		BrowserLaunch.test.log(LogStatus.PASS, "Content Aggregator Link Is Present ");

		// For Content Provider Link Verification
		boolean f = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CNTNT_PRO_LNK"))).isDisplayed();
		System.out.println("CNTNT_PRO_LNK is present " + f);
		String str4 = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CNTNT_PRO_LNK"))).getText();
		Assert.assertEquals("Content Provider", str4);
		System.out.println(str4 + " Expected Result");
		Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CNTNT_PRO_LNK"))).click();
		BrowserLaunch.test.log(LogStatus.PASS, "UserManagemnet Link Is Present ");

		// For Content Provider Link Verification
		boolean g = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CRM_LNK"))).isDisplayed();
		System.out.println("CRM_LNK is present " + g);
		String str5 = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CRM_LNK"))).getText();
		Assert.assertEquals("CRM", str5);
		System.out.println(str5 + " Expected Result");
		Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CRM_LNK"))).click();
		BrowserLaunch.test.log(LogStatus.PASS, "UserManagemnet Link Is Present ");

	}

}
