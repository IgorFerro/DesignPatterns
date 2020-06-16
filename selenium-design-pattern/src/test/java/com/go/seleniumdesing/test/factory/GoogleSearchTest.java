package com.go.seleniumdesing.test.factory;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.go.seleniumdesign.factory.GoogleFactory;
import com.go.seleniumdesign.factory.GooglePage;
import com.go.seleniumdesing.test.BaseTest;

public class GoogleSearchTest extends BaseTest {

	 private GooglePage googlePage;
		 
		 @Test(dataProvider = "getData")
		 public void searchTest(String language, String keyword) {
			 
			 this.googlePage = GoogleFactory.get(language, driver);
			 this.googlePage.launchSite();
			 this.googlePage.search(keyword);
			 int resultCount = this.googlePage.getResultsCount();
			 
			 System.out.println("Result Count : " + resultCount);
	}
		 
		 @DataProvider
		 public Object[][] getData(){
			 return new Object[][] {
				 {"ENG", "selenium"},
				 {"FR", "desing patterns"},
				 {"SA", "docker"},
				 {"ES", "docker"}
			 };
		 }
	
}
