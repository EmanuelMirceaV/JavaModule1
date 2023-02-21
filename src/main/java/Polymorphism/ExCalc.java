package Polymorphism;

public class ExCalc {
    // Using Polymorphism, provide the option to calculate the sum of 2 numbers, first integers and then doubles
    // Use that option in a different class. Provide values for each case, and print the results

    static int Adding(int a, int b){
        return a + b;
    }

    static double Adding(double a, double b){
        return a + b;
    }
}

class Calculate {

    public static void main(String[] args) {

        System.out.println(ExCalc.Adding(33,58));
        System.out.println(ExCalc.Adding(2.3, 7.9));

    }

}
