package com.tp8.payement;

public class PaymentService {

	private final PaymentProcessor processor;

	// constructeur
	public PaymentService(PaymentProcessor processor) {
		this.processor = processor;
	}

	//

	public boolean pay(double amount) {
		System.out.println(" Traitement du paiement via : " + processor.getPaymentMethod());
		boolean success = processor.processPayment(amount);
		if (success) {
			System.out.println("Transaction terminée avec succès.");
		} else {
			System.out.println("Transaction échouée.");
		}
		return success;
	}
}
