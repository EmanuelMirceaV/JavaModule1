package org.example;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {

        // If Statements:

        float f1 = 2.5F;
        boolean b3 = (f1 == 3);

        if(true){
            System.out.println("The statement is true");
        }

        if(b3){
            System.out.println("The statement won't be printed");
        }

        // If Else

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter your age");

        int age = scan1.nextInt();
        System.out.println("Thanks, your age is: " + age);

        if(age >= 18){
            System.out.println("Access granted");
        } else{
            System.out.println("Access denied");
        }

        // Else If statements

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter your username");

        String user = scan2.next();
        int nr = user.length();

        if(nr >=0 && nr <=5){
            System.out.println("Your username is too short.");
        } else if (nr >= 6 && nr <= 10){
            System.out.println("Welcome " + user);
        } else {
            System.out.println("Your username is too long. It must have between 6 and 10 chart");
        }

        // Switch Case

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Enter the number of the module from the list");

        int Module = scan3.nextInt();

        switch (Module) {
            case 1:
                System.out.println("Module nr." + Module + " is Agile");
                break;
            case 2:
                System.out.println("Module nr." + Module + " is Data Visualisation");
                break;
            case 3:
                System.out.println("Module nr." + Module + " is Version Control");
                break;
            case 4:
                System.out.println("Module nr." + Module + " is Python");
                break;
            case 5:
                System.out.println("Module nr." + Module + " is Testing");
                break;
            case 6:
                System.out.println("Module nr." + Module + " is API");
                break;
            case 7:
                System.out.println("Module nr." + Module + " is Java");
                break;
        }
    }
}
