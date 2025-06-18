package com.rebaza.solid_java.ISP.ejemplo1;

public class ISPJuniorDeveloper implements ISPWorkable, ISPEatable, ISPSleepable {

    @Override
    public void sleep() {
        System.out.println("Junios Developer sleeping.");
    }

    @Override
    public void eat() {
        System.out.println("Junios Developer eating.");
    }

    @Override
    public void work() {
        System.out.println("Junios Developer working.");
    }
    
}
