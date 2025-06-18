package com.rebaza.solid_java.LSP.ejemplo1;

// Cliente solo necesita leer (puede usar LSPReadOnlyFile o LSPEditableFile)
public class LSPFileReader {
    public void readDocument(LSPReadableFile file){
        System.out.println("Leyendo documento: " + file.read());
    }
}
