package com.rebaza.solid_java.LSP.ejemplo1;

public class File {
    protected String content;

    public File(String initialContent){
        this.content = content;
    }

    public String read(){
        System.out.println("Leyendo el contenido del archivo: " + content);
        return content;
    }

    public void write(String newContent){
        System.out.println("Escribiendo el nuevo contenido del archivo: " + content);
        this.content = newContent;
    }
}
