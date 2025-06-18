package com.rebaza.solid_java.DIP.ejemplo2;

public class DIPPaymentProcessor {
    private DIPPaymentGateway gateway;

    public DIPPaymentProcessor(DIPPaymentGateway gateway){
        this.gateway = gateway;
    }

    public void makePayment(double amount){
        if (amount > 0) {
            gateway.processPayment(145.25);
        }else{
            System.out.println("Monto de pago inválido.");
        }
    }
}
