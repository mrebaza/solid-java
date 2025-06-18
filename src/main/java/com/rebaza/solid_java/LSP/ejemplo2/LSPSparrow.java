package com.rebaza.solid_java.LSP.ejemplo2;

public class LSPSparrow extends LSPBird implements LSPFlyable {

    @Override
    public void fly() {
        System.out.println("Gorrion volando.");
    }
    
}
