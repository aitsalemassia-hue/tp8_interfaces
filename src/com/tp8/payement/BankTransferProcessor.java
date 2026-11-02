package com.tp8.payement;

public class BankTransferProcessor implements PaymentProcessor {
	private final String accountNumber;

	// constructeur
	public BankTransferProcessor(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	// redifinition de la methode processPayment
	@Override
	public boolean processPayment(double amount) {
		// verifier si le montant positif
		if (amount <= 0) {
			System.out.println("Erreur : Montant invalide pour le virement.");
			return false;
		}
		System.out.println("Virement de " + amount + "DH vers le compte " + accountNumber + " initié.");
		// Simulation d'un délai de traitement
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			return false;
		}
		System.out.println("Virement confirmé.");
		return true;
	}
	

	@Override
	public String getPaymentMethod() {
		return "Virement Bancaire";
	}

}
