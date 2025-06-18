package com.rebaza.solid_java.LSP.ejemplo1;

public class LSPEditableFile implements LSPReadableFile, LSPWritableFIle {
    private String content;

    public LSPEditableFile(String initialContent) {
        this.content = initialContent;
    }

    @Override
    public String read() {
        System.out.println("Leyendo contenido del archivo (editable)" + content);
        return content;
    }

    @Override
    public void write(String newContent) {
        System.out.println("Escribiendo nuevo contenido al archivo (editable)" + content);
        this.content = newContent;
    }

}