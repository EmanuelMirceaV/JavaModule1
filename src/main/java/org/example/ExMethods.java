package org.example;

import java.util.Scanner;

public class ExMethods {
    // Write a program that requests the full name of the user, and prints it after the message "Hello, ", with the use of a method

    public static void main(String[] args) {
        System.out.println("Please enter your full name");
        System.out.println("Hello, " + getFullName());
    }
    public static String getFullName(){
        Scanner scan1 = new Scanner(System.in);
        return scan1.nextLine();
    }
}
