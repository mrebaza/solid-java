package com.rebaza.solid_java.LSP.ejemplo2;

public class LSPEagle extends LSPBird implements LSPFlyable {

    @Override
    public void fly() {
        System.out.println("Agila volando");
    }
    
}
