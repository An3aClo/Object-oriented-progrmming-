package employee1;

import java.util.Scanner;

public abstract class Employee1 {

    double netpay;

    public abstract double CalcNet(double grossPay);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name");
        String name = input.next();

        System.out.println("Enter grossPay");
        double grossPay = input.nextDouble();

        LabTech lab = new LabTech();
        System.out.println(name + " your net salary is: R"+lab.CalcNet(grossPay));
    }

}
