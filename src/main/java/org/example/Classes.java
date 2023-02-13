package org.example;

public class Classes {

    String subject;
    String level;
    int durationHR;

    public static void main(String[] args) {
        Classes Java1 = new Classes();       // Constructor

        Java1.subject = "Java";
        Java1.level = "Basics";
        Java1.durationHR = 24;

        System.out.println("We are learning " + Java1.subject + " " + Java1.level);

    }

}
