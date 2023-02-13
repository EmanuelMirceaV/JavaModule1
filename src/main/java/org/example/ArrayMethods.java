package org.example;


import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {

        int [] grades = {5,6,7,8,9,10};
        int [] grades2 = {6,5,7,8,9,10};

        String [] progLang = {"C", "C++", "Java", "Python", "JavaScript", "PHP"};

        String [] webServices = new String[3];
        webServices[0] = "XAMPP";
        webServices[1] = "Tomcat";
        webServices[2] = "WildFly";

        // 1. Fill
        int [] arr = new int[4];
        Arrays.fill(arr, 55);

        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();

        // 2. Copy
        int [] newGrades = Arrays.copyOf(grades, grades.length);

        for(int i : newGrades){
            System.out.print(i + " ");
        }

        System.out.println();

        // 3. Compare 2 arrays - Equals (check if the values of each index are the same)
        System.out.println(Arrays.equals(progLang, webServices));
        System.out.println(Arrays.equals(grades, grades2));

        System.out.println();

        // 4. Sort

        Arrays.sort(grades2);
        for(int i : grades2){
            System.out.print(i + " ");
        }

        System.out.println();

        // 5. binarySearch - Returns the Index of an Element from an Array. It doesn't sort it, so do that first
        System.out.println(Arrays.binarySearch(grades2, 6));

        System.out.println();

        // 6. Print all Elements of an Array
        for (int i=0; i< webServices.length; i++){
            System.out.println(webServices[i]);
        }

    }
}
