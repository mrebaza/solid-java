package com.rebaza.solid_java.DIP.ejemplo1;

public class EmailSender {
    public void sendEmail(String recipient, String message){
        System.out.println("Enviando email dorectamente a " + recipient + ": "+ message);
    }
}
