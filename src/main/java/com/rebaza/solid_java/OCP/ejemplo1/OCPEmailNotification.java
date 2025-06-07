package com.rebaza.solid_java.OCP.ejemplo1;

public class OCPEmailNotification implements OCPNotification {

    @Override
    public void send(String recipient, String message) {
        System.out.println("Enviando email a " + recipient + ": " + message);
        // Lógica de envío de mensaje
    }
    
}
