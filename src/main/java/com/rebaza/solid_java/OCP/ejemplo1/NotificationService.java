package com.rebaza.solid_java.OCP.ejemplo1;

// Clase NotificationService que viola OCP
public class NotificationService {
    public void sendNotification(String type, String recipient, String message){
        if("email".equals(type)){
            System.out.println("Enviando Email a " + recipient + ": " + message);
            // Lógica de envío de email
        } else if ("sms".equals(type)) {
            System.out.println("Emviando SMS a " + recipient + ": " + message);
            // Lógica de envío de sms.
        }
        // Si queremos añadir "push", "whatsap", etc tendremos que modificar
        // esta clase
    }
}
