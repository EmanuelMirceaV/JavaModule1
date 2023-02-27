package Wrappers;

public class MainBoxing {
    // Wrapper class:
    // Use Primitive data types as Reference data types
    // Reference Data Types contain methods
    // They can be used with Collections like ArrayList

    public static void main(String[] args) {

        Boolean B = true;
        Character C = '$';
        Integer I = 0123;
        Double D = 2.50;
        String S = "Text";

        if(B==true){
            System.out.println("The boolean is true");
        }

        // 1. Autoboxing - Converting primitive data types into objects
        int i = 5;
        //Integer val = new Integer(i);
        Integer val = Integer.valueOf(i);
        System.out.println(val);

        // 2. Unboxing - Converting the wrapper class to a primitive data type
        int j;
        j = val.intValue();
        System.out.println(j);

        // 3. Check even or odd number with Autoboxing and Unboxing
        Integer intNr1 = 7; // Autoboxing
        System.out.println(intNr1 + " is " + checkNr(intNr1)); // Unboxing - Done by the compiler

        Integer intNr2 = 10; // Autoboxing
        System.out.println(intNr2 + " is " + checkNr(intNr2)); // Unboxing - Done by the compiler
    }

    public static String checkNr(int input) {
        if(input%2==0)
            return "even";
        else
            return "odd";
    }
}
