package com.rebaza.solid_java.ISP.ejemplo2;

public class SimplePrinter implements Machine {

    @Override
    public void print() {
        System.out.println("Imprimiento documento.");
    }

    @Override
    public void scan() {
        // No aplica
    }

    @Override
    public void fax() {
        // No aplica
    }

    @Override
    public void photocopy() {
        // No aplica
    }
    
}
