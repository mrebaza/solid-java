package com.rebaza.solid_java.SRP.ejemplo1;

import java.util.List;

public class Order {
    private String orderId;
    private List<String> items;
    private double totalAmount;

    public Order(String orderId, List<String> items, double totalAmount){
        this.orderId = orderId;
        this.items = items;
        this.totalAmount = totalAmount;
    }

    // Responsabilidad 1: Gestion de los datos del pedido
    public String getOrderId(){ return orderId; }
    public List<String> getItems(){ return items; }
    public double getTotalAmount(){ return totalAmount; }

    // Responsabilidad 2: Persistencia ( guardar en base de datos )
    public void saveToDataBase(){
        System.out.println("Guardando pedido" + orderId + " en la base de datos");
    }

    // Responsabilidad 3: Reportes (generar factura)
    public void generateInvoice(){
        System.out.println("Generando factura para el pedido "+ orderId + " ...");
    }
}
