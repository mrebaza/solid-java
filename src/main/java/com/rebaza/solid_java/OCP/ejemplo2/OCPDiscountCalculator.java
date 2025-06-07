package com.rebaza.solid_java.OCP.ejemplo2;

public class OCPDiscountCalculator {
    private OCPDiscountStrategy strategy;

    public void setDiscountStrategy( OCPDiscountStrategy strategy ){
        this.strategy = strategy;
    }

    public double calculate(double amount){

        if( strategy == null){
            System.out.println("No se ha configurado ninguna estrategia de descuento");
        }
        return strategy.applyDiscount(amount);
    }
}
