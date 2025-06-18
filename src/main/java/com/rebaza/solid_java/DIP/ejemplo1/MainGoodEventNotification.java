package com.rebaza.solid_java.DIP.ejemplo1;

public class MainGoodEventNotification {
    public static void main(String[] args){
        // Usando EmailSender
        DIPMessageSender emailSender = new DIPEmailSender();
        DIPEventNotifier emailNotifier = new DIPEventNotifier(emailSender);
        emailNotifier.notify("admin@admin.com", "Servidor #1: en uso.");

        // 
        DIPMessageSender smsSender = new DIPSmsSender();
        DIPEventNotifier eventNotifier = new DIPEventNotifier(smsSender);
        eventNotifier.notify("987456331", "Servidor #2: Uso de CPU alto.");
    }
}
