package com.go.seleniumdesing.test.decorator;

import java.util.List;
import java.util.function.Consumer;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.go.seleniumdesign.decorator.DashboardPage;

public class Decorators {

	private static void shouldDisplay(List<WebElement>elements) {
		elements.forEach(element -> Assert.assertTrue(element.isDisplayed()));
	}
	
	private static void shouldNotDisplay(List<WebElement>elements) {
		elements.forEach(element -> Assert.assertFalse(element.isDisplayed()));
	}
	
	//Ingredients
	private static final Consumer<DashboardPage> adminComponentPresent = (dp)-> shouldDisplay(dp.getAdminComponents());
	private static final Consumer<DashboardPage> adminComponentNotPresent = (dp)-> shouldNotDisplay(dp.getAdminComponents());
	private static final Consumer<DashboardPage> suComponentPresent = (dp)-> shouldNotDisplay(dp.getSuperUserComponents());
	private static final Consumer<DashboardPage> suComponentNotPresent = (dp)-> shouldNotDisplay(dp.getSuperUserComponents());
	private static final Consumer<DashboardPage> guestComponentPresent = (dp)-> shouldNotDisplay(dp.getGuestComponents());
	private static final Consumer<DashboardPage> guestComponentNotPresent = (dp)-> shouldNotDisplay(dp.getGuestComponents());
	
	//Role selection
	private static final Consumer<DashboardPage> adminSelection = (dp) -> dp.selectRole("admin");
	private static final Consumer<DashboardPage> suSelection = (dp) -> dp.selectRole("superuser");
	private static final Consumer<DashboardPage> guestSelection = (dp) -> dp.selectRole("guest");
	
	//user role pages
	public static final Consumer<DashboardPage> guestPage = guestSelection.andThen(guestComponentPresent).andThen(suComponentNotPresent).andThen(adminComponentNotPresent);
	public static final Consumer<DashboardPage> suPage = suSelection.andThen(guestComponentPresent).andThen(suComponentPresent);
	public static final Consumer<DashboardPage> adminPage = adminSelection.andThen(guestComponentPresent).andThen(suComponentPresent).andThen(adminComponentPresent); 
	

}
