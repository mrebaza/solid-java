package com.rebaza.solid_java.DIP.ejemplo1;

public class DIPSmsSender implements DIPMessageSender {
    @Override
    public void sendMessage(String recipiet, String message) {
        System.out.println("Enviado sms a " + recipiet + " : "+ message);
    }
}
