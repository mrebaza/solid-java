package com.rebaza.solid_java.OCP.ejemplo2;

public class OCPPremiunDiscount implements OCPDiscountStrategy {

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.10;
    }
    
}
