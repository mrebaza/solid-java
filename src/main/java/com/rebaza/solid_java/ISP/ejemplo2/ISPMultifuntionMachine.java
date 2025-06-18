package com.rebaza.solid_java.ISP.ejemplo2;

public class ISPMultifuntionMachine implements ISPPrinter, ISPScanner, ISPFax, ISPPhotocopier{

    @Override
    public void copy() {
        System.out.println("Imprimiendo documento.");
    }

    @Override
    public void fax() {
        System.out.println("Faxeando documento.");
    }

    @Override
    public void scan() {
        System.out.println("Scaneando documento.");
    }

    @Override
    public void print() {
        System.out.println("Imprimiendo documento.");
    }

}
