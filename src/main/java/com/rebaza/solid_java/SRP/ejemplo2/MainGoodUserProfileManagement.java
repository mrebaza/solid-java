package com.rebaza.solid_java.SRP.ejemplo2;

public class MainGoodUserProfileManagement {
    public static void main(String[] args){
        UserSRPProfile user = new UserSRPProfile("Miguel","miguel@correo.com","123");

        UserSRPValidator validator = new UserSRPValidator();
        if(validator.validate(user)){
            UserSRPEmailService emailService = new UserSRPEmailService();
            emailService.sendWelcomeEmail(user);
        } else {
            System.out.println("El Perfil de usuario no es valido.");
        }
    }
}
