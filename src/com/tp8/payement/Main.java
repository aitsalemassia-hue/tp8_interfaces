package com.tp8.payement;

import com.tp8.notification.*;

public class Main {
	public static void main(String[] args) {

		// test avec carte bancaire
		PaymentProcessor carteProcesseur = new CreditCardProcessor("4560-7860-1111-1111");
		PaymentService carteService = new PaymentService(carteProcesseur);

		carteService.pay(50.0);

		System.out.println("\n");

		// test avec virement
		PaymentProcessor transferProcessor = new BankTransferProcessor("RT90-0000-6700-1112-3456");
		PaymentService transferService = new PaymentService(transferProcessor);
		transferService.pay(150.0);

		System.out.println("\n");
		// Partie notifications

		System.out.println("TESTS NOTIFICATIONS\n");
		// notification par e-mail
		NotificationSender emailSender = new EmailNotificationSender();
		NotificationService emailService = new NotificationService(emailSender);
		emailService.sendWelcomeMessage("assiya@gmail.com");

		System.out.println("\n");
		// notification par sms
		NotificationSender smsSender = new SmsNotificationSender();
		NotificationService smsService = new NotificationService(smsSender);
		smsService.sendWelcomeMessage("+212647890975");

		System.out.println("\n");
		// Partie tests Supplementaires

		// Montant négatif
		PaymentService s1 = new PaymentService(new CreditCardProcessor("1234-5678-9012-3456"));
		s1.pay(-20.0); // "Montant invalide"

		// Montant nul
		s1.pay(0);

		// Virement avec montant invalide
		PaymentService s2 = new PaymentService(new BankTransferProcessor("MA64-0000-1111-2222"));
		s2.pay(-100.0);

		System.out.println("\n");

		// email invalide

		NotificationSender email2sender = new EmailNotificationSender();
		NotificationService email2Service = new NotificationService(email2sender);

		email2Service.sendWelcomeMessage("assiya.gmail.com");

	}

}
