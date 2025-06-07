package com.rebaza.solid_java.SRP.ejemplo2;

public class MainBadUserProfileManagement {
    public static void main(String[] args){
        UserProfile user = new UserProfile("Miguel", "miguel@correo.com", "123");
        if(user.isValidEmail() && user.isValidPassword()){
            user.sendWelcomeEmail();
        }
    }
}
