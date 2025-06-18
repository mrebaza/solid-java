package com.rebaza.solid_java.ISP.ejemplo2;

public class ScannerPrinter implements Machine {

    @Override
    public void print() {
        System.out.println("Imprimiendo documento.");
    }

    @Override
    public void scan() {
        System.out.println("Scaneando documento.");
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
