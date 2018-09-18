package tuitionfee;

/**
 * TuitionFee 
 * Author: Andrea Cloete
 * 2016/09/07
 * Question 1.3
 * Program to calculate the tuition fee in 10 years.
 **/
import java.util.Scanner;

public class TuitionFee {

    private double currentAmt;
    private double increaseAmt;
    private double newAmt;
//

    public TuitionFee(double currentAmt, double increaseAmt, double newAmt) {
        this.currentAmt = currentAmt;
        this.increaseAmt = increaseAmt;
        this.newAmt = newAmt;
    }

    public double calcAmt(double currentAmt, double newAmt) {

        for (int count = 0; count < 10; count++) {
            newAmt = currentAmt / Math.pow((1 / (1 + increaseAmt)), 10);
        }

        return (double) newAmt;
    }

    public void displayAll() {

        System.out.println("The amount in 10 years is R "
                + calcAmt(currentAmt, newAmt));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the current tuition fee");
        double currentAmt = input.nextDouble();

        double increaseAmt = 0.06;
        double newAmt = 0;

        TuitionFee t = new TuitionFee(currentAmt, increaseAmt, newAmt);
        t.calcAmt(currentAmt, newAmt);
        t.displayAll();

    }

}
