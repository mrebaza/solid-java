package com.rebaza.solid_java.LSP.ejemplo1;

public class ReadOnlyFile extends File {

    public ReadOnlyFile(String initialContent) {
        super(initialContent);
    }
    
    @Override
    public void write(String newContent) {
        // Esto viola LSP: la subclase cambia el comportamiento de la clase base
        // de una manera que puede sorprender al cliente.
        // Un cliente que espera un 'File' no espera que 'write' falle o no haga nada.
        System.out.println("ERROR: No se puede escribir en un archivo de solo lectura.");
        throw new UnsupportedOperationException("Operación de escritura no soportada.");
    }
}
