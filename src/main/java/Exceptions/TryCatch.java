package Exceptions;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class TryCatch {

    public static void main(String[] args) {
    /*
    // Ex.1
        try {
            int[] ar1 = {1, 2, 3};
            System.out.println(ar1[3]);
        } catch (Exception e) {
            System.out.println("No value for that index");
        }

    // Ex.2
       Scanner scan1 = new Scanner(System.in);

        System.out.println("Please enter the first nr");
        int nr1 = scan1.nextInt();
        System.out.println("Please enter the second nr");
        int nr2 = scan1.nextInt();

        try {
            int div = nr1 / nr2;
            System.out.println(div);
        } catch (Exception e) {
            System.out.println("Can't divide by 0");
        } finally {
            System.out.println("End of the execution");
        }

    // Ex.3
     int[] ar2 = null;
     try {
        System.out.println(ar2[1]);
    } catch (NullPointerException e) {
        System.out.println(e);
        System.out.println("The array is null");
    }
    */

    // Ex.4
    Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter password");
        String pw = scan1.nextLine();

        try {
            checkPw(pw);
        }
        catch (Exception e){
            System.out.println("Info " + e);
        }
    }

    static void checkPw(String pw) throws CustomException{
        if (pw.equals("Password1")){
            throw new CustomException("Access granted");
        }
        else {
            System.out.println("Access denied");
        }
    }
}