package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Constants {
	public static String Cdriverlocation="D:\\SeleniumFiles\\chromedriver_win32\\chromedriver.exe";
	public static String FdriverLocation="D:\\SeleniumFiles\\geckodriver-v0.24.0-win64\\geckodriver.exe";
	public static WebDriver driver;
	
	public static Properties prop;
	public static Properties prop1;
	static {
		prop = new Properties();
		FileInputStream sp;
		try {
			sp = new FileInputStream(
					"C:/Users/santosh/eclipse-workspace/sdp_auto/src/main/java/com/locators/config.properties");
			prop.load(sp);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		prop1 = new Properties();
		FileInputStream sp1;
		try {
			sp1 = new FileInputStream(
					"C:/Users/santosh/eclipse-workspace/sdp_auto/src/main/java/com/locators/global.properties");
			prop1.load(sp1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
	}
}
