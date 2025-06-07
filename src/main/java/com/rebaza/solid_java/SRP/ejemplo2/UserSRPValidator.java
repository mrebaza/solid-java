package com.rebaza.solid_java.SRP.ejemplo2;

// Responsabilidad 2: Validación de datos de usuario
public class UserSRPValidator {
    public boolean isValidEmail(String email){
        return email != null && email.contains("@");
    }

    public boolean isValidPassword(String password){
        return password != null && password.length() >= 8;
    }

    public boolean validate(UserSRPProfile user){
        return isValidEmail(user.getEmail()) && isValidPassword(user.getPassword());
    }
}
