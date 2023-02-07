package org.example;

public class Variables {

    static final int MAX_NR = 101;

    public static void main(String[] args){

        /* Data Types

           1. Primitive

             - byte
             - short
             - int
             - long
             - float
             - double
             - char
             - boolean

           2. Non-Primitive

             - String
             - Arrays
             - Classes
             - Interfaces
             etc.

           3. Type Casting
    */

        //  1. Primitive Data Types

        byte b1 = 0;
        short s1 = 10;
        int i3 = 999999999;
        int i4 = -500, i5 = 33;

        System.out.println(i3);
        System.out.println(s1 + i4);
        System.out.println(b1 * i5);

        long l1 = 999999999999l;
        float f1 = 2.5f;
        double d1 = 9999.44;

        System.out.println(l1);
        System.out.println(f1);
        System.out.println(d1);

        char c1 = 'A';
        System.out.println(c1);

        boolean B1 = true;
        boolean B2 = (s1 == 10);
        boolean B3 = (f1 == 3);

        System.out.println(B1);
        System.out.println(B2);
        System.out.println(B3);

        // 2. Non-Primitive Data Types

        // Strings:

        String str1 = "This is a string";
        str1 = "This is the same string";
        System.out.println(str1);

        // Constants

        // final int MAX_NR = 100;
        // MAX_NR = 110;
        System.out.println(MAX_NR);

        // 3. Type Casting

        // Widening

        int myInt1 = 5;
        double myDouble1 = myInt1;

        System.out.println(myInt1);
        System.out.println(myDouble1);


        // Narrowing

        double myDouble2 = 5.25d;
        int myInt2 = (int) myDouble2;

        System.out.println(myDouble2);
        System.out.println(myInt2);

    }
}
