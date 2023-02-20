package Inheritance;
// 1. Use inheritance to create a program that will include a Bank Account, a Credit Card account and a Savings Account
// 2. The default amount for each account can be 0
// 3. Provide the following values for each account

/*
Credit Card account:
    - amount = 10000
    - fee = 5
Savings Account:
    - amount = 2500
    - interest = 3.75
*/
// 4. Print the following statements and values:
    /*
        - "Account details:"

    For Credit Card account, print:
        - "Credit card amount $:"
        - "Credit card monthly fee $"

    For Savings Account, print:
        - "Savings account amount $:"
        - "Savings account amount %:"
    */
public class ExInherit {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();
        CreditCard cred = new CreditCard();
        SavingsAccount save = new SavingsAccount();

        acc.info();

        System.out.println("Credit card amount $: " + cred.amount);
        System.out.println("Credit card monthly fee $: " + cred.fee);
        System.out.println("Savings account amount $: " + acc.amount);
        System.out.println("Savings account amount %: " + save.interest);

    }

}
