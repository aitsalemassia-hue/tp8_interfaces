package com.tp8.payement;

public class CreditCardProcessor implements PaymentProcessor {
	private final String cardNumber;
	
	public CreditCardProcessor(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        // Simulation d'une vérification de solde
        if (amount <= 0) {
            System.out.println("Erreur : Montant invalide pour la carte " + cardNumber);
            return false;
        }
        System.out.println("Paiement de " + amount + "DH par carte " + cardNumber + " accepté.");
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "Carte Bancaire";
    }
    
    
}
