package com.rebaza.solid_java.SRP.ejemplo1;

// Responsabilidad 2: Persistencia (guadado de datos)
public class OrderSRPRepository {
    public void save(OrderSRP order) {
        System.out.println("Guardando pedido " + order.getOrderId() + " en la base de datos.");
        // Lógica de base de datos para guardar OrderSRP
    }    
}
