package com.go.seleniumdesign.template;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.go.seleniumdesign.template.pages.AmazonProductDescriptionPage;
import com.go.seleniumdesign.template.pages.AmazonResultsPage;
import com.go.seleniumdesign.template.pages.AmazonSearchPage;

public class AmazonShoppingRefactoring extends ShoppingTemplate {
	
	private WebDriver driver;
	private String product;
	
	private AmazonSearchPage amazonSearchPage;
	private AmazonResultsPage amazonResultsPage;
	private AmazonProductDescriptionPage amazonProductDescriptionPage;
	
	
	public AmazonShoppingRefactoring(WebDriver driver, String product) {
		this.driver = driver;
		this.product = product;
		this.amazonSearchPage = PageFactory.initElements(driver, AmazonSearchPage.class);
		this.amazonResultsPage = PageFactory.initElements(driver, AmazonResultsPage.class);
		this.amazonProductDescriptionPage = PageFactory.initElements(driver, AmazonProductDescriptionPage.class);
		
		
	}

	@Override
	public void launchSite() {
		this.amazonSearchPage.goTo();
		
	}

	@Override
	public void searchForProduct() {
		this.amazonSearchPage.search(product);
			
	}

	@Override
	public void selectProduct() {
		this.amazonResultsPage.selectProduct();
		
	}

	@Override
	public void buy() {
		this.amazonProductDescriptionPage.buy();
	}

}
