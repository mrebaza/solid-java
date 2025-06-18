package com.rebaza.solid_java.ISP.ejemplo2;

public class MainBadMachineSystem {
    public static void main(String[] args){
        SimplePrinter printer = new SimplePrinter();
        printer.print();
        printer.scan(); // llama a un metodó vacio. potencial error.
    }
}
