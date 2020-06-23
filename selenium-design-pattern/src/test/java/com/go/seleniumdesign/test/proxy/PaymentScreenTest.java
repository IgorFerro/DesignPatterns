package com.go.seleniumdesign.test.proxy;



import java.util.Map;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Maps;

import com.go.seleniumdesign.proxy.PaymentOptionFactory;
import com.go.seleniumdesign.proxy.PaymentScreen;
import com.go.seleniumdesing.test.BaseTest;



public class PaymentScreenTest extends BaseTest{
	
	private PaymentScreen paymentScreen;
	
	@BeforeTest
	public void setPaymentScreen() {
		System.setProperty("env", "QA");
		this.paymentScreen = new PaymentScreen(this.driver);
		
	}
	
	@Test(dataProvider = "getData")
	public void paymentTest(String option, Map<String, String> paymentDetails) {
		this.paymentScreen.goTo();
		this.paymentScreen.getUserInformantion().enterDetails();
		this.paymentScreen.setPaymentOption(PaymentOptionFactory.get(option));
		this.paymentScreen.pay(paymentDetails);
		this.paymentScreen.getOrder().placeOrder();
		String orderNumber = this.paymentScreen.getOrder().placeOrder();
		
		System.out.println("Order Number : " +orderNumber);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Map<String, String> cc = Maps.newHashMap();
		cc.put("cc", "123434324");
		cc.put("year", "2026");
		cc.put("cvv", "123");
		
		Map<String, String> nb = Maps.newHashMap();
		nb.put("bank", "WELLS FARGO");
		nb.put("acount", "myaccount123");
		nb.put("pin", "123");
		
		
		return new Object[][] {
			{"CC", cc},
			{"NB", nb}
		};
		
	}
	
}
