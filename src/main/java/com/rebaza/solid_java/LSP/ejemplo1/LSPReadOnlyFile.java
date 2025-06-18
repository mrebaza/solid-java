package com.rebaza.solid_java.LSP.ejemplo1;

public class LSPReadOnlyFile implements LSPReadableFile {

    private String content;

    public LSPReadOnlyFile(String initialContent){
        this.content = initialContent;
    }
    @Override
    public String read() {
        System.out.println("Leyendo contenido del archivo (Solo lectura): " + content);    
        return content;
    }
    
}
