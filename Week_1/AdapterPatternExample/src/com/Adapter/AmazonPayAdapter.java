package com.Adapter;

public class AmazonPayAdapter implements PaymentProcessor {
	public AmazonPayAdapter(AmazonPay amazonpay) {
		this.amazonpay = amazonpay;
	}
	AmazonPay amazonpay;
	@Override
	public void processPayment() {
		// TODO Auto-generated method 
		amazonpay.amazonPay();
	}

}
