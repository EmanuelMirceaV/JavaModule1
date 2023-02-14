package package1;
import package2.*;
public class Class2 {

    private String priVar = "Private variable"; // 4. Private Access Modifier - Only visible to the class that contains it

    public static void main(String[] args) {

       // private String priVar = "Private variable";
        Class2 C2 = new Class2();
        System.out.println(C2.priVar);
    }





}
