package com.rebaza.solid_java.LSP.ejemplo2;

public class Penguin extends Bird {
    
    @Override
    public void fly() {
        // Un pinguino no vuela, anular esto rompe la sustituibilidad
        System.out.println("ERROR: Los pinguinos no pueden volar.");
        throw new UnsupportedOperationException("Los pinguinos no vuelan.");
    }

    @Override
    public void eat() {
        System.out.println("Pinguino comiendo peces.");
    }
}
