package org.example;

public class BaseModule {              // This is a SuperClass (Parent class)

    String location = "at class and online";

    void infoModule(){
        System.out.println("Module information:");
    }

    void endCourse (String date){
        System.out.println("End of the Module is on: " + date);
    }
}
