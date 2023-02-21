package Generics;

public class GenericMethod {
    // Generics:
    // Enable classes and interfaces, to be parameters when defining other classes, interfaces or methods
    // Eliminate the need to create multiple versions of methods or classes for different data types
    // Enables you to use one version for all reference data types

    public static void main(String[] args) {
        Integer[] intArr = {0,1,2,3,4};
        Double[] doubleArr = {1.5, 2.5, 3.5, 4.5, 5.5};
        Character[] charArr = {'a', 'b', 'c', 'd', 'e'};
        String[] stringArr = {"this", "is", "a", "string", "array"};

        displayElements(intArr);
        displayElements(doubleArr);
        displayElements(charArr);
        displayElements(stringArr);
    }
    /*
    public static void displayElements(Integer[] array){
        for(Integer e : array){
            System.out.print(e + " ");
        }
        System.out.println();
    }
    public static void displayElements(Double[] array){
        for(Double e : array){
            System.out.print(e + " ");
        }
        System.out.println();
    }
    public static void displayElements(Character[] array){
        for(Character e : array){
            System.out.print(e + " ");
        }
        System.out.println();
    }
    public static void displayElements(String[] array){
        for(String e : array){
            System.out.print(e + " ");
        }
        System.out.println();
    }
    */

    public static <T> void displayElements (T[] array){
        for(T e : array){
            System.out.print(e + " ");
        }
        System.out.println();
    }

}
