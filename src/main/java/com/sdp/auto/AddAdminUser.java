package com.sdp.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.utils.Constants;

public class AddAdminUser {
	public static String str;
	public static void addAdminUser() throws Exception {
		
		Constants.driver.findElement(By.xpath(Constants.prop.getProperty("USERS"))).click();
		Constants.driver.findElement(By.xpath(Constants.prop.getProperty("USER_MGMT_LNK"))).click();
		str=Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CREATE_MGMT_TEXT"))).getText();
		Assert.assertEquals(str,"MANAGE USERS ");
		
		Constants.driver.findElement(By.xpath(Constants.prop.getProperty("ADMIN_LINK"))).click();
		Thread.sleep(200);
		str=Constants.driver.findElement(By.xpath(Constants.prop.getProperty("MNGE_ADMIN_TXT"))).getText();
		Assert.assertEquals(str,"MANAGE ADMIN ");
		Constants.driver.findElement(By.xpath(Constants.prop.getProperty("ADD_ADMIN"))).click();
		str=Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CREATE_ADMIN_TXT"))).getText();
		Assert.assertEquals(str, "CREATE ADMIN ");
		Constants.driver.findElement(By.name(Constants.prop.getProperty("USERNAME"))).sendKeys(Constants.prop1.getProperty("Username"));
		Constants.driver.findElement(By.name(Constants.prop.getProperty("PASSWORD"))).sendKeys(Constants.prop1.getProperty("password"));
		Constants.driver.findElement(By.name(Constants.prop.getProperty("MOBILENUMBER"))).sendKeys(Constants.prop1.getProperty("mobile"));
		Constants.driver.findElement(By.name(Constants.prop.getProperty("EMAIL"))).sendKeys(Constants.prop1.getProperty("email"));
		Constants.driver.findElement(By.name(Constants.prop.getProperty("ADDRESS"))).sendKeys(Constants.prop1.getProperty("address"));
		Constants.driver.findElement(By.name(Constants.prop.getProperty("CITY"))).sendKeys(Constants.prop1.getProperty("city"));
		Constants.driver.findElement(By.name(Constants.prop.getProperty("STATE"))).sendKeys(Constants.prop1.getProperty("state"));
		Constants.driver.findElement(By.name(Constants.prop.getProperty("COUNTRY"))).sendKeys(Constants.prop1.getProperty("country"));
		Constants.driver.findElement(By.name(Constants.prop.getProperty("ZIPCODE"))).sendKeys(Constants.prop1.getProperty("zip"));
		Thread.sleep(1000);
		Select dropdown=new Select(Constants.driver.findElement(By.name(Constants.prop.getProperty("WORKFLOW"))));
		dropdown.selectByIndex(1);
		Constants.driver.findElement(By.name(Constants.prop.getProperty("CHECKACT"))).click();
		
		//Constants.driver.findElement(By.xpath(Constants.prop.getProperty("ADD_BTN"))).click();
		Constants.driver.findElement(By.xpath(Constants.prop.getProperty("BACK_BTN"))).click();
		
	}

	public static void modifyUser() {
		
	}

}
