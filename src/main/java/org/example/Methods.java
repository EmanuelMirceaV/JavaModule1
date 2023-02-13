package org.example;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {

        // The println method
        String title = "Text";
        System.out.println(title);
        System.out.println(title.toUpperCase());

        // The Scanner method
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first argument");
        String argument1 = scan.nextLine();
        System.out.println(argument1);

        //Ex.1 - Print a string
        //System.out.println("Hello");
        print("Hello again");
        print("How are you?");

        //Ex.2 - Sum of 2 nr
        sum(2,3);

        //Ex.3 - Calculate the sum of the elements in an array
        int [] grades = new int[3];
        grades[0] = 1;
        grades[1] = 5;
        grades[2] = 3;

        int sum = adding(grades);
        print("The sum of the array is " + sum);

        // Ex.4 - Void method
        addText("St");

        // Ex.5 - A string method
        String nextText = addText2("St");
        print(nextText);
    }

    public static void print(String words){
        System.out.println(words);
    }

    public static void sum(int nr1, int nr2){
        System.out.println(nr1 + nr2);
    }

    public static int adding(int[] grades){
        int addition=0;
        for (int i=0;i< grades.length;i++){
            addition +=grades[i];
        }
        return addition;
    }

    public static void addText(String st){
        System.out.println(st + "ring1");
    }

    public static String addText2(String st){
        return st + "ring2";
    }
}
