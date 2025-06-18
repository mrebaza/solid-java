package com.rebaza.solid_java.DIP.ejemplo1;

public class DIPEmailSender implements DIPMessageSender {
    @Override
    public void sendMessage(String recipiet, String message) {
        System.out.println("Enviando email a " + recipiet + " : "+ message);   
    }
}
