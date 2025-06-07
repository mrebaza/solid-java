package com.rebaza.solid_java.SRP.ejemplo1;

// Responsabilidad 3: Generacion de reportes (factura)
public class OrderSRPInvoiceGenerator {
    public void generate(OrderSRP order) {
        System.out.println("Generando factura para el pedido " + order.getOrderId() + " con un total de $" + order.getTotalAmount());
        // Lógica de generación de factura
    }    
}
