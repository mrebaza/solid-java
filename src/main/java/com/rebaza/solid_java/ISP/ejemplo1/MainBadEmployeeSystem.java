package com.rebaza.solid_java.ISP.ejemplo1;

public class MainBadEmployeeSystem {
    public static void main(String[] args){
        JuniorDeveloper juniorDeveloper =  new JuniorDeveloper();
        juniorDeveloper.eat();
        juniorDeveloper.work();
        juniorDeveloper.manageProjects(); // Esto llama a un metodo vacio y es incorrecto.
        
        ProjectManager projectManager = new ProjectManager();
        projectManager.work();
        projectManager.eat();
        projectManager.codeReview(); // Esto llama a un metodo vacio y es incorrecto.
    }
}
