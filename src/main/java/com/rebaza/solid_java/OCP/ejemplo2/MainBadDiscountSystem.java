package com.rebaza.solid_java.OCP.ejemplo2;

public class MainBadDiscountSystem {
    public static void main(String[] args){
        DiscountCalculator calculator = new DiscountCalculator();

        System.out.println("Descuento regular: $"+ calculator.calculateDiscount("regular", 10));
        System.out.println("Descuento premiun: $"+ calculator.calculateDiscount("premiun", 10));
        System.out.println("Descuento vip: $"+ calculator.calculateDiscount("vip", 10));
    }
}
