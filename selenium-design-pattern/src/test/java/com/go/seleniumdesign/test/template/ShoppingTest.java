package com.go.seleniumdesign.test.template;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.go.seleniumdesign.template.AmazonShopping;
import com.go.seleniumdesign.template.EBayShopping;
import com.go.seleniumdesign.template.ShoppingTemplate;
import com.go.seleniumdesing.test.BaseTest;

public class ShoppingTest extends BaseTest {
	
	@Test(dataProvider = "getData")
	public void shoppingTest(ShoppingTemplate shoppingTemplate) {
		shoppingTemplate.shop();
	}
	
	@DataProvider
	public Object[] getData() {
		return new Object[] {
				new AmazonShopping(driver, "samsung"),
				new EBayShopping(driver, "samsumg")
		};
	}

}
