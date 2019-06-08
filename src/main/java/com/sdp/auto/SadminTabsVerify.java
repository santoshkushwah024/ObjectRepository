package com.sdp.auto;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.LogStatus;
import com.utils.BrowserLaunch;
import com.utils.Constants;

public class SadminTabsVerify {
	public static WebElement element;
	public static Actions act;
	public static boolean b;
	
	public static void tabs(int i) {
		ArrayList<String> tabs=new ArrayList<String>(Constants.driver.getWindowHandles());
		Constants.driver.switchTo().window(tabs.get(i));
		
	}

	public static void stabsVerify() throws Exception {

		Thread.sleep(200);
		// Constants.login();
		// For Users Tab
		boolean b = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("USERS"))).isDisplayed();
		System.out.println("USERS tab is present " + b);
		element = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("USERS")));
		act = new Actions (Constants.driver);
		act.moveToElement(element)
				.moveToElement(Constants.driver.findElement(By.xpath(Constants.prop.getProperty("USERS")))).click()
				.build().perform();
		BrowserLaunch.test.log(LogStatus.PASS, "User tab is Present and Clicked Successfully");

		// For Services Tab
		Thread.sleep(200);
		b = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("SERVICES"))).isDisplayed();
		System.out.println("SERVICES tab is present " + b);
		element = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("SERVICES")));
		act = new Actions (Constants.driver);
		act.moveToElement(element)
				.moveToElement(Constants.driver.findElement(By.xpath(Constants.prop.getProperty("SERVICES")))).click()
				.build().perform();
		BrowserLaunch.test.log(LogStatus.PASS, "Services tab is Present and Clicked Successfully");

		// For Adaptors tab Verification
		Thread.sleep(200);
		b = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("ADAPTORS"))).isDisplayed();
		System.out.println("Adaptors tab is present " + b);
		element = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("ADAPTORS")));
		act = new Actions (Constants.driver);
		act.moveToElement(element)
				.moveToElement(Constants.driver.findElement(By.xpath(Constants.prop.getProperty("ADAPTORS")))).click()
				.build().perform();
		BrowserLaunch.test.log(LogStatus.PASS, "ADAPTORS tab is Present and Clicked Successfully");

		// For Connector tab Verification
		Thread.sleep(200);
		b = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CONNECTORS"))).isDisplayed();
		System.out.println("Connectors tab is present " + b);
		element = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CONNECTORS")));
		act = new Actions (Constants.driver);
		act.moveToElement(element)
				.moveToElement(Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CONNECTORS")))).click()
				.build().perform();
		BrowserLaunch.test.log(LogStatus.PASS, "CONNECTORS tab is Present and Clicked Successfully");

		// For Content tab Verification
		Thread.sleep(200);
		b = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CONTENTS"))).isDisplayed();
		System.out.println("CONTENTS tab is present " + b);
		element = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CONTENTS")));
		act = new Actions (Constants.driver);
		act.moveToElement(element)
				.moveToElement(Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CONTENTS")))).click()
				.build().perform();
		BrowserLaunch.test.log(LogStatus.PASS, "CONTENT tab is Present and Clicked Successfully");
		tabs(0);
		// For Subscribers tab Verification
		Thread.sleep(200);
		b = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("SUBSCRIBERS"))).isDisplayed();
		System.out.println("SUBSCRIBERS tab is present " + b);
		element = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("SUBSCRIBERS")));
		act = new Actions (Constants.driver);
		act.moveToElement(element)
				.moveToElement(Constants.driver.findElement(By.xpath(Constants.prop.getProperty("SUBSCRIBERS")))).click()
				.build().perform();
		BrowserLaunch.test.log(LogStatus.PASS, "SUBSCRIBERS tab is Present and Clicked Successfully");

		// For Policy tab Verification
		Thread.sleep(200);
		b = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("POLICY"))).isDisplayed();
		System.out.println("POLICY tab is present " + b);
		element = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("POLICY")));
		act = new Actions (Constants.driver);
		act.moveToElement(element)
				.moveToElement(Constants.driver.findElement(By.xpath(Constants.prop.getProperty("POLICY")))).click()
				.build().perform();
		BrowserLaunch.test.log(LogStatus.PASS, "POLICY tab is Present and Clicked Successfully");

		// For RatePlans tab Verification
		Thread.sleep(200);
		b = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("RATEPLANS"))).isDisplayed();
		System.out.println("RATEPLANS tab is present " + b);
		element = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("RATEPLANS")));
		act = new Actions (Constants.driver);
		act.moveToElement(element)
				.moveToElement(Constants.driver.findElement(By.xpath(Constants.prop.getProperty("RATEPLANS")))).click()
				.build().perform();
		BrowserLaunch.test.log(LogStatus.PASS, "RATEPLANS tab is Present and Clicked Successfully");

		// For WORKfLOWS tab Verification
		Thread.sleep(200);
		b = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("WORKFLOWS"))).isDisplayed();
		System.out.println("WORKFLOWS tab is present " + b);
		element = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("WORKFLOWS")));
		act = new Actions (Constants.driver);
		act.moveToElement(element)
				.moveToElement(Constants.driver.findElement(By.xpath(Constants.prop.getProperty("WORKFLOWS")))).click()
				.build().perform();
		BrowserLaunch.test.log(LogStatus.PASS, "WORKFLOWS tab is Present and Clicked Successfully");

		// For MISPAGE tab Verification
		Thread.sleep(200);
		b = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("MISPAGE"))).isDisplayed();
		System.out.println("MISPAGE tab is present " + b);
		element = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("MISPAGE")));
		act = new Actions (Constants.driver);
		act.moveToElement(element)
				.moveToElement(Constants.driver.findElement(By.xpath(Constants.prop.getProperty("MISPAGE")))).click()
				.build().perform();
		BrowserLaunch.test.log(LogStatus.PASS, "SUBSCRIBERS tab is Present and Clicked Successfully");
		tabs(0);
		// For DEVICES tab Verification
		Thread.sleep(200);
		b = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("DEVICES"))).isDisplayed();
		System.out.println("DEVICES tab is present " + b);
		element = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("DEVICES")));
		act = new Actions (Constants.driver);
		act.moveToElement(element)
				.moveToElement(Constants.driver.findElement(By.xpath(Constants.prop.getProperty("DEVICES")))).click()
				.build().perform();
		BrowserLaunch.test.log(LogStatus.PASS, "SUBSCRIBERS tab is Present and Clicked Successfully");

		// For SYSTEM MGMT tab Verification
		Thread.sleep(200);
		b = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("SYSMGMT"))).isDisplayed();
		System.out.println("SYSTEM MGMT tab is present " + b);
		element = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("SYSMGMT")));
		act = new Actions (Constants.driver);
		act.moveToElement(element)
				.moveToElement(Constants.driver.findElement(By.xpath(Constants.prop.getProperty("SYSMGMT")))).click()
				.build().perform();
		BrowserLaunch.test.log(LogStatus.PASS, "SYSTEM MGMT tab is Present and Clicked Successfully");

		// For CRM tab Verification
		Thread.sleep(200);
		b = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CRM"))).isDisplayed();
		System.out.println("CRM tab is present " + b);
		element = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CRM")));
		act = new Actions (Constants.driver);
		act.moveToElement(element)
				.moveToElement(Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CRM")))).click().build()
				.perform();
		BrowserLaunch.test.log(LogStatus.PASS, "CRM tab is Present and Clicked Successfully");
		tabs(0);
		// For AGREEMENT tab Verification
		Thread.sleep(200);
		b = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("AGREEMENT"))).isDisplayed();
		System.out.println("AGREEMENT tab is present " +b);
		element = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("AGREEMENT")));
		act = new Actions (Constants.driver);
		act.moveToElement(element)
				.moveToElement(Constants.driver.findElement(By.xpath(Constants.prop.getProperty("AGREEMENT")))).click()
				.build().perform();
		BrowserLaunch.test.log(LogStatus.PASS, "AGREEMENT tab is Present and Clicked Successfully");

		// For SHORT_CODES tab Verification
		Thread.sleep(200);
		b = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("SHORT_CODES"))).isDisplayed();
		System.out.println("SHORT_CODES tab is present " + b);
		element = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("SHORT_CODES")));
		act = new Actions (Constants.driver);
		act.moveToElement(element)
				.moveToElement(Constants.driver.findElement(By.xpath(Constants.prop.getProperty("SHORT_CODES")))).click()
				.build().perform();
		BrowserLaunch.test.log(LogStatus.PASS, "SHORT_CODES tab is Present and Clicked Successfully");

		// For USERS_ACTIONS tab Verification
		Thread.sleep(200);
		b = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("USERS_ACTIONS"))).isDisplayed();
		System.out.println("USERS_ACTIONS tab is present " + b);
		element = Constants.driver.findElement(By.xpath(Constants.prop.getProperty("USERS_ACTIONS")));
		act = new Actions (Constants.driver);
		act.moveToElement(element)
				.moveToElement(Constants.driver.findElement(By.xpath(Constants.prop.getProperty("USERS_ACTIONS")))).click()
				.build().perform();
		BrowserLaunch.test.log(LogStatus.PASS, "SHORT_CODES tab is Present and Clicked Successfully");

	}

}
