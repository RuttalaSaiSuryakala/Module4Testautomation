package com.io.example;

import java.io.FileInputStream;

import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesEx {
	public static String browser;
	public static String url;
	static WebDriver driver;
	static Properties prop = new Properties();
	public static void readProperties() {
		
		try {
			InputStream is = new FileInputStream(
					"D:\\eclipseenter2\\Module4\\src\\main\\java\\config.properties");
			prop.load(is);
			System.out.println(prop.getProperty("browser"));
		} catch (Exception e) {
			System.out.println(e);
		}
		}
	//this method is to return the driver
		public static WebDriver setBrowser()
		{
			
			return driver = new ChromeDriver();
		}
		//This method is used to set the browser
		public static  void setBrowserConfig()
		{
			browser=prop.getProperty("browser");
				if(browser.equals("chrome"));
					{
						System.setProperty("webdriver.chrome.driver","D:\\eclipseenter2\\Module4\\src\\main\\java\\chromedriver.exe");
					}
		}
		//this method is for sending the url
		public static String urlprop()
		{
			return prop.getProperty("url");
		}
	//This method is to close the terminal
		public static void endTest() {
			driver.quit();
		}
}
