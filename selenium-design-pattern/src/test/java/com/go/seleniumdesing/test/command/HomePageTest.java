package com.go.seleniumdesing.test.command;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.go.seleniumdesign.command.ElementValidator;
import com.go.seleniumdesign.command.HomePage;
import com.go.seleniumdesing.test.BaseTest;

public class HomePageTest extends BaseTest {
	
	private HomePage homepage;
	
	@BeforeTest
	public void setHomePage() {
		this.homepage = new HomePage(driver);
	}
	
	@Test
	public void homePageTest() {
		this.homepage.goTo();
		
		/* OLD JAVA
		for(ElementValidator ev: this.homepage.getElementValidators()) {
			boolean result = ev.validade();
			Assert.assertTrue(result);
		}*/
		
		//JAVA 8
		this.homepage.getElementValidators()
		.stream()
		.map(ev -> ev.validade())
		.forEach(b -> Assert.assertTrue(b));
	}

}
