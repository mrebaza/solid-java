package com.rebaza.solid_java.SRP.ejemplo1;

import java.util.List;

// Responsabilidad 1: gestion de datos
public class OrderSRP {
    private String orderId;
    private List<String> items;
    private double totalAmount;

    public OrderSRP(String orderId, List<String> items, double totalAmount){
        this.orderId = orderId;
        this.items = items;
        this.totalAmount = totalAmount;
    }

    public String getOrderId(){ return orderId; }
    public List<String> getItems(){ return items;}
    public double getTotalAmount(){ return totalAmount;}
}
