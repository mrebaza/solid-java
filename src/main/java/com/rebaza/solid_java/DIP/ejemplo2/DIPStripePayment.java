package com.rebaza.solid_java.DIP.ejemplo2;

public class DIPStripePayment implements DIPPaymentGateway {

    @Override
    public void processPayment(double amount) {
        System.out.println("Procesando pago $" + amount + " a través de Stripe");
    }

    

}
