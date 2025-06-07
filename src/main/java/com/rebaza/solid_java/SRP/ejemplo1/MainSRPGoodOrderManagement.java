package com.rebaza.solid_java.SRP.ejemplo1;

import java.util.List;

public class MainSRPGoodOrderManagement {
    public static void main(String[] args) {
        OrderSRP myOrder = new OrderSRP("ORD123", List.of("Laptop", "Mouse"), 1250.00);

        OrderSRPRepository repository = new OrderSRPRepository();
        repository.save(myOrder); // Solo se encarga de guardar

        OrderSRPInvoiceGenerator invoiceGenerator = new OrderSRPInvoiceGenerator();
        invoiceGenerator.generate(myOrder); // Solo se encarga de generar la factura
    }    
}
