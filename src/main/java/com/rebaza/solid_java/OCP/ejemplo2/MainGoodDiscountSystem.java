package com.rebaza.solid_java.OCP.ejemplo2;

public class MainGoodDiscountSystem {
    public static void main(String[] args){
        OCPDiscountCalculator calculator = new OCPDiscountCalculator();

        calculator.setDiscountStrategy(new OCPRegularDiscount());
        System.out.println("Descuento regular $"+ calculator.calculate(10));

        calculator.setDiscountStrategy(new OCPPremiunDiscount());
        System.out.println("Descuento Premiun $" + calculator.calculate(10));

        calculator.setDiscountStrategy(new OCPVipDiscount());
        System.out.println("Descuento Vip $" + calculator.calculate(10));
    }
}
