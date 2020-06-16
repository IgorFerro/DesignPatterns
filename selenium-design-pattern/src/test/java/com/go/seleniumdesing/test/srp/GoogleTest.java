package com.go.seleniumdesing.test.srp;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.go.seleniumdesign.srp.main.GoogleMainPage;
import com.go.seleniumdesign.srp.result.GoogleResultPage;
import com.go.seleniumdesing.test.BaseTest;

public class GoogleTest extends BaseTest {

	private GoogleMainPage googleMainPage;
	private GoogleResultPage googleResultPage;
	
	@BeforeTest
	public void setupPages() {
	    this.googleMainPage = new GoogleMainPage(driver);
	    this.googleResultPage = new GoogleResultPage(driver);
		
	}
	
	@Test(dataProvider = "getData")
	public void googleWorkflow(String keyword, int index) {
		
		//String keyword = "selenium webdriver";
		//int index = 3;
		
		googleMainPage.goTo();
		Assert.assertTrue(googleMainPage.getSearchWidget().isDisplayed());
		
		googleMainPage.getSearchWidget().enter(keyword);
		Assert.assertTrue(googleMainPage.getSearSuggestion().isDisplayed());
		
		googleMainPage.getSearSuggestion().clickSuggestionByIndex(index);
		Assert.assertTrue(googleResultPage.getNavigationBar().isDisplayed());
		
		googleResultPage.getSearchWidget().enter(keyword);
		Assert.assertTrue(googleResultPage.getSearchSuggestion().isDisplayed());
		
		googleResultPage.getSearchSuggestion().clickSuggestionByIndex(index);
		
		googleResultPage.getNavigationBar().goToNews();
		
		System.out.println(
				     googleResultPage.getResultStat().getStat()
				);	
	}
	
	public Object[][] getData(){
		
		return new Object[][] {
			{"selenium", 3},
			{"docker", 2}
		};
	}
	
}
