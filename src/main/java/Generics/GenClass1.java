package Generics;

public class GenClass1<T> {

    T v1;

    GenClass1(T v1)  {           // Setter method
        this.v1 = v1;
    }

    public T getVal() {         // Getter method
        return v1;
    }

}
