package com.rebaza.solid_java.DIP.ejemplo2;

public class MainGoodPaymentProcessing {
    public static void main(String[] args){
        // Usando Stripe
        DIPPaymentGateway stripe = new DIPStripePayment();
        DIPPaymentProcessor processor = new DIPPaymentProcessor(stripe);
        processor.makePayment(125.25);

        // Usando PayPal
        DIPPaymentGateway payPal = (DIPPaymentGateway) new DIPPayPalPayment();
        DIPPaymentProcessor processor2 = new DIPPaymentProcessor(payPal);
        processor2.makePayment(152.23);
    }
}
