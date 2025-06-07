package com.rebaza.solid_java.SRP.ejemplo2;

public class UserSRPEmailService {
    public void sendWelcomeEmail(UserSRPProfile user){
        if(new UserSRPValidator().isValidEmail(user.getEmail())){
            System.out.println("Enviado correo de bienvenida a " + user.getEmail());
        }else {
            System.out.println("Error: No se pudo enviar el correo a " + user.getEmail());
        }
    }
}
