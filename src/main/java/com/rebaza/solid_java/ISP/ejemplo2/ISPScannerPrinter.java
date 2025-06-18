package com.rebaza.solid_java.ISP.ejemplo2;

public class ISPScannerPrinter implements ISPPrinter, ISPScanner {

    @Override
    public void scan() {
        System.out.println("Imprimiento documento.");
    }

    @Override
    public void print() {
        System.out.println("Scaneando documento.");
    }

}
