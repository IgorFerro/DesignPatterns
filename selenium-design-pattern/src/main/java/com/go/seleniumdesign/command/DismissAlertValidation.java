package com.go.seleniumdesign.command;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DismissAlertValidation extends ElementValidator {
	
	private final WebElement dismissAlert;
	
	public  DismissAlertValidation(final WebElement element) {
		this.dismissAlert =element;
	}
	

	@Override
	public boolean validade() {
		boolean result1 = this.dismissAlert.isDisplayed();//true
		this.dismissAlert.findElement(By.cssSelector("button.close")).click();
		boolean result2 = this.dismissAlert.isDisplayed();//false
		return result1 && (!result2);
	}

}
