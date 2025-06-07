package com.rebaza.solid_java.OCP.ejemplo1;

public class OCPPushNotification implements OCPNotification {

    @Override
    public void send(String recipient, String message) {
        System.out.println("Envio de PUSH a " + recipient + " : " + message);
    }
    
}
