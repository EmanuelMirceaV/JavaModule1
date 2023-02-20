package org.example;

public class JavaI implements SubjectsI, TestInterface {      // Multiple Inheritance


    @Override
    public void courseContent() {
        System.out.println("Java Fundamentals");
    }

    @Override
    public void codeCompiler() {
        System.out.println("With IntelliJ");
    }

    @Override
    public void courseDuration(int hours) {
        System.out.println("The course lasts " + hours + " hours and is worth " + hours*2 + " point" );
    }

    @Override
    public void testing() {

    }
}
