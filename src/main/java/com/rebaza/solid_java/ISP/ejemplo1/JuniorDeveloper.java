package com.rebaza.solid_java.ISP.ejemplo1;

public class JuniorDeveloper implements ComplexWorker {

    @Override
    public void work() {
        System.out.println("Junior developer working.");
    }

    @Override
    public void eat() {
        System.out.println("Junior developer eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Junior developer sleeping.");
    }

    @Override
    public void manageProjects() {
        // No aplica
    }

    @Override
    public void codeReview() {
        // No aplica
    }

    @Override
    public void attendClientMeetings() {
        // No aplica
    }
    
}
