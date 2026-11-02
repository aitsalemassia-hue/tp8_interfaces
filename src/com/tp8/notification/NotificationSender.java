package com.tp8.notification;

public interface NotificationSender {
	
	void sendNotification(String recepteur, String message);
	
	
	String getChannelType();
	
}
