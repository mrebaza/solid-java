package com.rebaza.solid_java.SRP.ejemplo2;

public class UserProfile {
    private String username;
    private String email;
    private String password;

    public UserProfile(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Responsabilidad 1: Gestion de datos
    public String getUserName(){ return username;}
    public String getEmail(){ return email;}
    public String getPassword(){ return password;}

    // Responsabilidad 2: Validación de datos
    public boolean isValidEmail(){
        return email != null && email.contains("@");
    }

    public boolean isValidPassword(){
        return password != null && password.length() >= 8;
    }

    // Responsabilidad 3: Enviar notificaciones
    public void sendWelcomeEmail(){
        if(isValidEmail()){
            System.out.println("Enviando correo de bienvenida a "+ email);
        }else{
            System.out.println("Error: No se pudo enviar el correo " + email);
        }
    }
}
