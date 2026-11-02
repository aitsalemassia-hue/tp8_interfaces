package com.tp8.notification;

public class EmailNotificationSender implements NotificationSender{

	@Override
	public void sendNotification(String recepteur, String message) {
		if(!recepteur.contains("@")) {
			System.out.println("EMAIL-> Erreur : adresse invalide "+recepteur);
			return;
		}
		 System.out.println("EMAIL-> Envoi du message à " + recepteur + " : " + message);
	}
	
	
	@Override
	public String getChannelType() {
		return "Email";
	}
	
}
