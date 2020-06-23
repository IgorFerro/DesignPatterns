package com.go.seleniumdesign.test.executearound;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.go.seleniumdesign.executearound.MainPage;
import com.go.seleniumdesing.test.BaseTest;

public class FrameTest extends BaseTest {

	private MainPage mainPage;
	
	@BeforeTest
	public void setMainPage() {
		this.mainPage = new MainPage(driver);
	}
	
	@Test
	public void frameTest() {
		this.mainPage.goTo();
		/*
		this.mainPage.onFrameA(a -> a.setFirstName("fn1"));
		this.mainPage.onFrameB(a -> a.setFirstName("fn2"));
		this.mainPage.onFrameA(a -> a.setLastName("ln1"));*/
		
		this.mainPage.onFrameA(a ->{
			a.setFirstName("fn1");
			a.setMessage("I'm going to fill text area");
		});
		
		this.mainPage.onFrameC(c -> c.setAddress("address for FrameC"));
		this.mainPage.onFrameB(b -> b.setMessage("This is for Frame B"));
	}
}
