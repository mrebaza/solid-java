package com.rebaza.solid_java.DIP.ejemplo2;

public class DIPPayPalPayment implements DIPPaymentGateway {

    @Override
    public void processPayment(double amount) {
        System.out.println("Procesando pago $" + amount + " a través de PayPal");
    }

}
