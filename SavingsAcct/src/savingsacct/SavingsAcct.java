package savingsacct;

import java.util.Scanner;

public class SavingsAcct {

    private double deposit;
    private double withdrawl;

    public SavingsAcct(double deposit, double withdrawl) {
        this.deposit = deposit;
        this.withdrawl = withdrawl;

    }

    public double balance(double deposit, double withdrawl) {

        double balance = deposit - withdrawl;
        return balance;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter deposit");
        double x = input.nextDouble();

        System.out.println("Enter withdrawl");
        double g = input.nextDouble();

        SavingsAcct ac = new SavingsAcct(x, g);
        System.out.println("The balance is: R " + ac.balance(x, g));

    }

}
