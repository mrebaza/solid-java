package com.rebaza.solid_java.OCP.ejemplo1;

public class MainBadNotificationSystem {
    public static void main(String[] args){
        NotificationService service = new NotificationService();
        service.sendNotification("email", "user@correo.com", "cuerpo del correo");
        service.sendNotification("sms", "987654331", "mensaje de texto.");
    }
}
