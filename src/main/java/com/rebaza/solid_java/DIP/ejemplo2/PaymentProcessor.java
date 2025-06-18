package com.rebaza.solid_java.DIP.ejemplo2;

public class PaymentProcessor {
    private StripeGateway gateway;

    public PaymentProcessor(){
        this.gateway = new StripeGateway();
    }

    public void proccessPayment(double amount){
        if(amount > 0){
            gateway.charge(amount);
        }else {
            System.out.println("Monto inválido para el pago.");
        }
    }
}
