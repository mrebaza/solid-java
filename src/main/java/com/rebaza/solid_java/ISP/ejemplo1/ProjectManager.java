package com.rebaza.solid_java.ISP.ejemplo1;

public class ProjectManager implements ComplexWorker {

    @Override
    public void work() {
        System.out.println("Project Manager working.");
    }

    @Override
    public void eat() {
        System.out.println("Project Manager eating..");
    }

    @Override
    public void sleep() {
        System.out.println("Project Manager sleeping.");
    }

    @Override
    public void manageProjects() {
        System.out.println("Project Manager manageing Projects.");
    }

    @Override
    public void codeReview() {
        // No aplica
    }

    @Override
    public void attendClientMeetings() {
        System.out.println("Project Manager attending meetings.");
    }
    
}
