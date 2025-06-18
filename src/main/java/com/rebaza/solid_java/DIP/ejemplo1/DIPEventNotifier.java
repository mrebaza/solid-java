package com.rebaza.solid_java.DIP.ejemplo1;

public class DIPEventNotifier  {
    private DIPMessageSender sender;

    public DIPEventNotifier(DIPMessageSender sender){
        this.sender = sender;
    }

    public void notify(String recipiet, String eventDetails){
        String message = "Notificación de evento: " + eventDetails;
        sender.sendMessage(recipiet, message);
    }
}
