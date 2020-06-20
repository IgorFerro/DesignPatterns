package com.go.seleniumdesing.test.strategy;

import java.util.Map;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.go.seleniumdesign.strategy.PaymentOption;
import com.go.seleniumdesign.strategy.PaymentScreen;
import com.go.seleniumdesing.test.BaseTest;

public class PaymentScreenTest extends BaseTest{
	
	private PaymentScreen paymentScreen;
	
	@BeforeTest
	public void setPaymentScreen() {
		this.paymentScreen = new PaymentScreen(this.driver);
		
	}
	
	@Test
	public void paymentTest(PaymentOption paymentOption, Map<String, String> paymentDetails) {
		this.paymentScreen.goTo();
		this.paymentScreen.getUserInformantion().enterDetails();
		this.paymentScreen.setPaymentOption(paymentOption);
		this.paymentScreen.pay(paymentDetails);
		this.paymentScreen.getOrder().placeOrder();
		String orderNumber = this.paymentScreen.getOrder().placeOrder();
		
		System.out.println("Order Number : " +orderNumber);
		
	}

}
