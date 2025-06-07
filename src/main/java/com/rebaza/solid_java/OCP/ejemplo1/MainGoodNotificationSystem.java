package com.rebaza.solid_java.OCP.ejemplo1;

public class MainGoodNotificationSystem {
    public static void main(String[] args){
        OCPNotificationSender sender = new OCPNotificationSender();

        // Envio correo
        sender.send(new OCPEmailNotification(), "Miguel", "miguel@correo.com");

        // Envio de SMS
        sender.send(new OCPSmsNotification(), "987654321", "mensaje de texto");
        
        // Envio de PUSH
        sender.send(new OCPPushNotification(), "devide_id", "mensaje push");
    }
}
