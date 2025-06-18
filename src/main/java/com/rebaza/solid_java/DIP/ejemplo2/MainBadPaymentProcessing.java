package com.rebaza.solid_java.DIP.ejemplo2;

public class MainBadPaymentProcessing {
    public static void main(String[] args){

        PaymentProcessor processor = new PaymentProcessor();
        processor.proccessPayment(123.2);
    }
}
