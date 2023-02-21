package Generics;

public class GenClass2<T, V>{

    T val1;     // One Data Type

    V val2;     // Another Data Type

    GenClass2(T val1, V val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1(){
        return val1;
    }

    public V getVal2(){
        return val2;
    }
}
