package com.rebaza.solid_java.ISP.ejemplo2;

public class ISPSimplePrinter implements ISPPrinter {

    @Override
    public void print() {
        System.out.println("Imprimiento documento.");
    }

}
