package employee;

/**
 * Employee
 * Author: Andrea Cloete
 * 2016/09/07
 * Question 2.1
 * Program to calculate the net pay, tax, accumulate net pay as well as the 
 * accumulate tax for full time employees and part time employees.
 **/

import java.util.Scanner;

public abstract class Employee {

    String name;
    String surname;
    double gross;

    public abstract double CalculateTax(double gross, double hours);

    public abstract double CalculateNet(double gross, double hours);

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.next();

        System.out.println("Enter your surname");
        String surname = input.next();

        System.out.println("Enter your gross pay in Rands");
        double gross = input.nextDouble();

        System.out.println("Enter the amount of hours "
                + "that you worked in a week");
        double hours = input.nextDouble();

        PartTimeEmployee p = new PartTimeEmployee();
        FullTimeEmployee f = new FullTimeEmployee();

        System.out.println(
                name + " " + surname + ":");

        System.out.println(" ~ Full time employee: Net salary = R"
                + f.CalculateNet(gross, hours));
        System.out.println("                      : Tax = R"
                + f.CalculateTax(gross, hours));

        System.out.println();

        System.out.println(" ~ Part time employee : Net salary = R"
                + p.CalculateNet(gross, hours));
        System.out.println("                      : Tax = R"
                + p.CalculateTax(gross, hours));
        System.out.println("                      : Accumulated net salary = R"
                + p.accumulateNet(hours));
        System.out.println("                      : Accumulated tax = R"
                + p.accumulateTax(hours));
    }
}
