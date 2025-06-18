package com.rebaza.solid_java.ISP.ejemplo2;

public class MainGoodMachineSystem {
    public static void main(String[] args){
        ISPSimplePrinter printer = new ISPSimplePrinter();
        printer.print();

        ISPScannerPrinter scanner = new ISPScannerPrinter();
        scanner.print();
        scanner.scan();

        ISPMultifuntionMachine multifuntional = new ISPMultifuntionMachine();
        multifuntional.print();
        multifuntional.scan();
        multifuntional.fax();
        multifuntional.copy();
    }
}   
