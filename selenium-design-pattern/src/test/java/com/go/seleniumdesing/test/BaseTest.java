package com.go.seleniumdesing.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import com.google.common.util.concurrent.Uninterruptibles;


public class BaseTest {

	protected WebDriver driver; 
	
	@BeforeClass
	public void setupDriver() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ifparreira\\Desktop\\GeckoDriver");
		this.driver = new FirefoxDriver();
	}
	
	@AfterTest
	public void quitDriver() {
		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		this.driver.quit();
	  }
	}
