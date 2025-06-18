package com.rebaza.solid_java.LSP.ejemplo1;

public class MainBadFileProcessor {
    public void processFile(File file){
        file.read();
        // El cliente espera poder escribir en cualquier File.
        file.write("Nuevo contenido importante");

        System.out.println("Contenido después de escribir: "+ file.read());
    }

    public static void main(String [] args){
        MainBadFileProcessor processor = new MainBadFileProcessor();
        File regularFile = new File("Contenido inicial.");
        processor.processFile(regularFile);

        System.out.println("\n--- Intentando con ReadOnlyFile ---");
        try {
            File readOnlyFile = new ReadOnlyFile("Contenido de solo lectura");
            processor.processFile(readOnlyFile);

        } catch (UnsupportedOperationException e) {
            // TODO: handle exception
            System.out.println("Capturando el error: " + e.getMessage());
        }
    }
}
