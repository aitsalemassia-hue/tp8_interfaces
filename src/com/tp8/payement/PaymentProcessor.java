package com.tp8.payement;


public interface PaymentProcessor{
	
	
	boolean processPayment(double amount);
	
	String getPaymentMethod();
}