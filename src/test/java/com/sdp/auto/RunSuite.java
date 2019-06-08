package com.sdp.auto;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.utils.BrowserLaunch;
import com.utils.Constants;

public class RunSuite {

	@BeforeTest
	public void reports() throws FileNotFoundException {
		BrowserLaunch.reports();

	}

	@BeforeClass
	public void browser() {
		BrowserLaunch.setup();
	}

	@Test(priority = 1,enabled=true)
	public void test() throws IOException {
		HomePage.homePage();
	}

	@Test(priority = 2,enabled=true)
	public void login() throws Exception {
		HomePage.login();
	}

	@Test(priority = 3,enabled=true)
	public void tabsActions() throws Exception {
		SadminTabsVerify.stabsVerify();
	}

	@Test(priority = 4,enabled=true)
	public void userMgmtAct() throws Exception {
		UserManagement.userManageActions();
	}
	@Test(priority = 5,enabled=true)
	public void userActions() throws Exception {
		AddAdminUser.addAdminUser();
	}
	@Test(priority = 6)
	public void addSubscr() throws Exception{
		AddSubscribers.addSubscriber();
		AddSubscribers.cancelFun();
		
		
	}
	@Test(priority = 7,enabled=true)

	public void logout() throws Exception {
		HomePage.logout();
		SadminTabsVerify.tabs(3);
		Constants.driver.close();
		SadminTabsVerify.tabs(2);
		Constants.driver.close();
		SadminTabsVerify.tabs(1);
		Constants.driver.close();
		

	}

	@AfterTest(enabled =true)
	public void closeBrowser() throws Exception {
		Thread.sleep(2000);
		BrowserLaunch.report.endTest(BrowserLaunch.test);
		BrowserLaunch.report.flush();
		Constants.driver.quit();
	}

}