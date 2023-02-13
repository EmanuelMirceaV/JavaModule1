package org.example;


public class Objects {
    public static void main(String[] args) {

       Classes Java1 = new Classes();       // Constructor

       Java1.subject = "Java";
       Java1.level = "Basics";
       Java1.durationHR = 24;

       Classes2 Python1 = new Classes2();

       Python1.subject = "Python";
       Python1.durationHR = 46;

       System.out.println("We are learning " + Java1.subject + " " + Java1.level + " after learning " + Python1.subject);
       System.out.println("The " + Java1.subject + " course, has a duration of " + Java1.durationHR + " hours");

        System.out.println(Python1.durationHR);
    }
}

class Classes2 {

    String subject;
    String level;
    int durationHR;
}
