package com.go.seleniumdesign.srp;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchSuggestion extends AbstractComponent {
	
	
	
	@FindBy(css ="li.sbct")
	private List<WebElement> suggestions;
	
	public SearchSuggestion(final WebDriver driver) {
		 super(driver);
	}
	
	public void clickSuggestionByIndex(int index) {
		this.suggestions.get(index -1).click();
	}
	

	@Override
	public boolean isDisplayed() {
		return this.wait.until((d) -> this.suggestions.size() > 5);
	}

}
