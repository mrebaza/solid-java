package com.rebaza.solid_java.LSP.ejemplo1;

// Cliente que necesita escribir (solo puede usar LSPEditableFile)
public class LSPFileWriter {
    public void modifyDocument(LSPWritableFIle file, String newContent){
        file.write(newContent);
    }
}
