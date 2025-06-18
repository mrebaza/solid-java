package com.rebaza.solid_java.ISP.ejemplo1;

public interface ComplexWorker {
    void work();
    void eat();
    void sleep();
    void manageProjects(); // Solo para Projects Managers
    void codeReview(); // Solo para Desarrolladores Senior
    void attendClientMeetings(); // Solo para Consultores
}
