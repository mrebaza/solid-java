package com.rebaza.solid_java.ISP.ejemplo1;

public class ISPProjectManager implements ISPWorkable, ISPEatable, ISPSleepable, ISPProjectManageable, ISPClientMeetingAttendee {

    @Override
    public void manageProjects() {
        System.out.println("Project Manager managing projects..");
    }

    @Override
    public void sleep() {
        System.out.println("Project Manager sleeping.");
    }

    @Override
    public void eat() {
        System.out.println("Project Manager eating.");
    }

    @Override
    public void work() {
        System.out.println("Project Manager working.");
    }

    @Override
    public void attendClientMeetings() {
        System.out.println("Project Manager attending meetings.");
    }
    
}
