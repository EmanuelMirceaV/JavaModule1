package Generics;

public class Numerics <T extends Number>{

    T val;

    Numerics(T val){
        this.val = val;
    }

    int square(){
        return val.intValue() * val.intValue();
        //return val.intValue() * val.intValue();
    }
}
