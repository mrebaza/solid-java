package com.rebaza.solid_java.ISP.ejemplo1;

public class MainGoodEmployeeSystem {
    public static void main(String[] args){
        ISPJuniorDeveloper junior = new ISPJuniorDeveloper();
        junior.work();
        // junior.manageProjects(); // Esto no compilará, lo cual es bueno porque no es su responsabilidad


        ISPProjectManager project = new ISPProjectManager();
        project.work();
        project.manageProjects();
        // manager.codeReview(); // Esto tampoco compilará
        
    }
}
