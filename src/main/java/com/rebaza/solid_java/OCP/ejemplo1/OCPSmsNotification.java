package com.rebaza.solid_java.OCP.ejemplo1;

public class OCPSmsNotification implements OCPNotification{

    @Override
    public void send(String recipient, String message) {
        System.out.println("Enviendo SMS a " + recipient + " : " + message);
        // Lógica de envío de SMS
    }
    
}
