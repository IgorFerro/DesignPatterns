package com.go.seleniumdesign.srp;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchSuggestion extends AbstractComponent {
	
	private WebDriverWait wait;
	
	@FindBy(css ="li.sbct")
	private List<WebElement> suggestions;
	
	public SearchSuggestion(final WebDriver driver) {
		this.wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}
	
	public void clickSuggestionByIndex(int index) {
		this.suggestions.get(index -1).click();
	}
	

	@Override
	public boolean isDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}

}
