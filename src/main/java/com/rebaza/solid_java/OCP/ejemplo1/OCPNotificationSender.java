package com.rebaza.solid_java.OCP.ejemplo1;

public class OCPNotificationSender {
    public void send(OCPNotification notification, String recipient, String message){
        notification.send(recipient, message);
    }
}
