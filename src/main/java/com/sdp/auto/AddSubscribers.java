package com.sdp.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;
import com.utils.BrowserLaunch;
import com.utils.Constants;

public class AddSubscribers {
	public static long mno=6400002L;
	public static long imsi=6161557070L;
	
	public static void sbcrTab(){
		Constants.driver.findElement(By.xpath(Constants.prop.getProperty("SUBSCRIBERS"))).click();		
		Constants.driver.findElement(By.xpath(Constants.prop.getProperty("ADD_BTN"))).click();
	}
	
	public static void alert() {
		
		String alerttxt=Constants.driver.switchTo().alert().getText();
		BrowserLaunch.test.log(LogStatus.FAIL, alerttxt);
		Constants.driver.switchTo().alert().accept();
	}
	public static void addSubscriber() throws Exception {
		//HomePage.homePage();
		//HomePage.login();

		//for (int i=1;i<=2;i++) {
			AddSubscribers.mno++;
			AddSubscribers.imsi++;
			sbcrTab();
		Constants.driver.findElement(By.name(Constants.prop.getProperty("MOBILE_NO"))).sendKeys("99"+AddSubscribers.mno);
			
		Constants.driver.findElement(By.name(Constants.prop.getProperty("IMSI"))).sendKeys("40454"+AddSubscribers.imsi);	;
			
		Select dropdown2=new Select(Constants.driver.findElement(By.name(Constants.prop.getProperty("PLMN"))));
		dropdown2.selectByIndex(1);
		
		Select dropdown3=new Select(Constants.driver.findElement(By.name(Constants.prop.getProperty("SBSCRTYPE"))));
		dropdown3.selectByIndex(1);
		Select dropdown8=new Select(Constants.driver.findElement(By.name(Constants.prop.getProperty("IN"))));
		dropdown8.selectByIndex(1);
		
		Select dropdown4=new Select(Constants.driver.findElement(By.name(Constants.prop.getProperty("SMS"))));
		dropdown4.selectByIndex(0);
		Select dropdown5=new Select(Constants.driver.findElement(By.name(Constants.prop.getProperty("MMS"))));
		dropdown5.selectByIndex(0);
		//String str =Constants.driver.findElement(By.name(Constants.prop.getProperty("WAP"))).getText();
		Select dropdown6=new Select(Constants.driver.findElement(By.name(Constants.prop.getProperty("WAP"))));
		dropdown6.selectByIndex(0);
		/*	
		Select dropdown7=new Select(Constants.driver.findElement(By.name(Constants.prop.getProperty("GNRLSRVC"))));
		dropdown7.selectByIndex(0);
		*/
		Constants.driver.findElement(By.xpath(Constants.prop.getProperty("ADD_SUB_BTN"))).click();
		BrowserLaunch.test.log(LogStatus.PASS, "Subscriber Added Successfully");
		alert();
	//	}
	}
	public static void cancelFun() {
		sbcrTab();
		Constants.driver.findElement(By.xpath(Constants.prop.getProperty("CNCL_BTN"))).click();
		BrowserLaunch.test.log(LogStatus.PASS, "Subscriber Creation Cancelled Successfully");
	}
	
	public static void modifySbcr() {
		sbcrTab();
		
		
	}
}
