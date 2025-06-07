package com.rebaza.solid_java.SRP.ejemplo1;

import java.util.List;

public class MainBadOrderManagement {
    public static void main(String[] args) {
        System.out.println("Ejemplo de mala gestión de pedidos (violando SRP)");
        // Aquí iría la lógica de ejemplo
        Order myOrder = new Order("ORD1", List.of("Laptop","Teclado","Mouse"), 55.5);
        myOrder.saveToDataBase();
        myOrder.generateInvoice();
    }
}