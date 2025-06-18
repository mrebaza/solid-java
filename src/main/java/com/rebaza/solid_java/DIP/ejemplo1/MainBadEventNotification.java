package com.rebaza.solid_java.DIP.ejemplo1;

public class MainBadEventNotification {
    public static void main(String[] args){
        EventNotifier event = new EventNotifier();

        event.notify("admin@admin.com", "El servidor se ha quedado sin memoria.");
    }
}
