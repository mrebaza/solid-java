package com.rebaza.solid_java.LSP.ejemplo1;


public class MainGoodFileProcessor {
    public static void main(String[] args){
        LSPFileReader reader = new LSPFileReader(); // LSPFileReader es una subclase de FileReader
        LSPFileWriter writer = new LSPFileWriter();
        
        LSPReadOnlyFile readOnlyFile = new LSPReadOnlyFile("documento secreto");
        reader.readDocument(readOnlyFile);

        LSPEditableFile editableFile = new LSPEditableFile("documento editable");
        reader.readDocument(editableFile);
        writer.modifyDocument(editableFile, "Nuevo contenido");
    }
}
