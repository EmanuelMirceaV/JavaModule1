package Generics;

public class TestThis {

    int I;

    public TestThis(int I) {            // Constructor with a parameter
        this.I = I;
    }

    public static void main(String[] args) {
        TestThis intVal = new TestThis(10);
        System.out.println("The value of I is: " + intVal.I);
    }

}
