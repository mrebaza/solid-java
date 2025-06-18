package com.rebaza.solid_java.DIP.ejemplo2;

public class StripeGateway {
    public void charge(double amount){
        System.out.println("Procesando pago $" + amount + "a través de Stripe. ");
    }
}
