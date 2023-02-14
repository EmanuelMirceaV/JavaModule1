package package2;
import package1.*;

public class SubClass1 extends Class1 {

    public static void main(String[] args) {

        Class3 C3 = new Class3();
        System.out.println(C3.defVar);

        SubClass1 sub = new SubClass1();
        System.out.println(sub.proVar);

        /*
        Class1 C1 = new Class1();
        System.out.println(C1.proVar);
        */
    }

}
