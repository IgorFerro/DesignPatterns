package com.go.seleniumdesign.executearound;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	private final WebDriver driver;
	
	@FindBy(id="a")
	private WebElement a;
	
	@FindBy(id="b")
	private WebElement b;
	
	@FindBy(id="c")
	private WebElement c;
	
	private FrameA frameA;
	private FrameB frameB;
	private FrameC frameC;
	
	
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.frameA = PageFactory.initElements(driver, FrameA.class);
		this.frameB = PageFactory.initElements(driver, FrameB.class);
		this.frameC = PageFactory.initElements(driver, FrameC.class);
	}
	
	public void goTo() {
		this.driver.get("https://vins-udemy.s3.amazonaws.com/ds/main.html");
	}
}
