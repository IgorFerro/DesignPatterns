package com.go.seleniumdesign.command;


import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private final WebDriver driver;
	
	//Buttons
	@FindBy(css = "div.button-box button.btn-info")
	private WebElement infoBtn;
	
	@FindBy(css = "div.button-box button.btn-warning")
	private WebElement warnBtn;
	
	@FindBy(css = "div.button-box button.btn-success")
	private WebElement successBtn;
	
	@FindBy(css = "div.button-box button.btn-danger")
	private WebElement dangerBtn;
	
	//Notifications
	@FindBy(css = "div.jq-icon-info")
	private WebElement infoAlert;
	
	@FindBy(css = "div.jq-icon-warning")
	private WebElement warningAlert;
	
	@FindBy(css = "div.jq-icon-success")
	private WebElement successAlert;
	
	@FindBy(css = "div.jq-icon-error")
	private WebElement dangerAlert;
	
	
	//Dismissal Alert
	@FindBy(css = "div.card-body div.row div:nth-child(2) div.alert-info")
	private WebElement dismissInfoAlert;
	
	@FindBy(css = "div.card-body div.row div:nth-child(2) div.alert-success")
	private WebElement dismissSuccessAlert;
	
	@FindBy(css = "div.card-body div.row div:nth-child(2) div.alert-danger")
	private WebElement dismissDangerAlert;
	
	@FindBy(css = "div.card-body div.row div:nth-child(2) div.alert-warning")
	private WebElement dismissWarnAlert;
	
	
	
	
	public HomePage(final WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public void goTo() {
		this.driver.get("https://www.wrappixel.com/demos/admin-templates/admin-pro/main/ui-notification.html");
	}

	
	public List<ElementValidator> getElementValidators(){
		
		return Arrays.asList(
		    
			//Notification
			new NotificationValidator(infoBtn,infoAlert),
			new NotificationValidator(successBtn,successAlert),
			new NotificationValidator(warnBtn,warningAlert),
			new NotificationValidator(dangerBtn,dangerAlert),
			
			//Dismiss
			new DismissAlertValidation(dismissInfoAlert),
			new DismissAlertValidation(dismissSuccessAlert),
			new DismissAlertValidation(dismissWarnAlert),
			new DismissAlertValidation(dismissDangerAlert)
		
				
				
		);
	
		
	}
}
