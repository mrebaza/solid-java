package com.rebaza.solid_java.DIP.ejemplo1;

public class EventNotifier {
    private EmailSender emailSender;

    public EventNotifier(){
        this.emailSender = new EmailSender();
    }

    public void notify(String recipient, String eventDetails){
        String message = "Notificacion de evento: " + eventDetails;

        emailSender.sendEmail(recipient, message);
    }
}
