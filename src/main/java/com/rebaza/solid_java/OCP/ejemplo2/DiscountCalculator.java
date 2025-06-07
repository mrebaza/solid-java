package com.rebaza.solid_java.OCP.ejemplo2;

public class DiscountCalculator {
    public double calculateDiscount(String customerType, double amount){
        
        if("regular".equals(customerType)){
            return amount * 0.05;
        } else if ("premiun".equals(customerType)) {
            return amount * 0.10;
        } else if ("vip".equals(customerType)) {
            return amount * 0.15;
        }        
        return 0;
    }
}
