package com.rebaza.solid_java.SRP.ejemplo2;

// Responsabilidad 1: Datos del perfil de usuario
public class UserSRPProfile {
    private String username;
    private String email;
    private String password;

    public UserSRPProfile(String username, String email, String password){
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUserName(){ return username;}
    public String getEmail(){ return email;}
    public String getPassword(){return password;}
}
