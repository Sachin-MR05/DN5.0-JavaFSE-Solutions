package com.Adapter;

public class GpayAdapter implements PaymentProcessor {
	private Gpay gpay;
	GpayAdapter(Gpay gpay){
		this.gpay=gpay;
	}
	@Override
	public void processPayment() {
		gpay.gpayPay();		
	}

}
