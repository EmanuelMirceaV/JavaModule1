package org.example;

public class Loops {

    public static void main(String[] args) {

        /* Loops:
            - For lops
            - While loops
            - Do While loops
            - For-Each loops
        */

        // For loop:

        for (int i = 0; i < 3; i++){        // i is a counter or index
            System.out.println(i);          // i < 3 is a condition
        }

        // While loop:

        int i = 0;

        while (i < 2) {
            System.out.println("The initial value of wl is 0");
            System.out.println(i);
            i++;
        }
        System.out.println(i);

        // For Each loop:

        String [] progLang = {"C++", "Java", "Python"};

        for(String prog : progLang) {
            System.out.println(prog);
        }

        // Do While:

        int wl = 0;

        do {
            System.out.println("The initial value of wl is 0");
            wl++;
        } while (wl < 0);
    }
}
