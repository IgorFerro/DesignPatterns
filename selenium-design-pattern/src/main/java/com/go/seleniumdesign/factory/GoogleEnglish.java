package com.go.seleniumdesign.factory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleEnglish extends GooglePage {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	@FindBy(name="q")
	private WebElement searcBox;
	
	
	@FindBy(name = "btnk")
	private WebElement searchBtn;
	
	@FindBy(css = "div.rc")
	private List<WebElement> results;
	
	
	public GoogleEnglish(final WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
	}
	
	@Override
	public void launchSite() {
		this.driver.get("https://wwww.google.com");
			
	}

	@Override
	public void search(String keyword) {
		this.searcBox.sendKeys(keyword);
		this.wait.until((d) -> this.searchBtn.isDisplayed());
		this.searchBtn.click();
		
		
	}

	@Override
	public int getResultsCount() {
		this.wait.until((d) -> this.results.size() > 1);
		return this.results.size();
	}

}
