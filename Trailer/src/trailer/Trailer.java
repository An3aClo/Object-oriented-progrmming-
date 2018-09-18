package trailer;

import java.util.Scanner;

public class Trailer {

    private double fixedCost;
    private double spesificAmt;
    private double numDay;
    private double numKm;

    public Trailer(double f, double s, double nd, double nk) {
        fixedCost = f;
        spesificAmt = s;
        numDay = nd;
        numKm = nk;
    }

    public double calcCost(double spesificAmt, double numDay, double numKm) {

        spesificAmt = 200.00;
        double cost = spesificAmt * numDay + (spesificAmt * numKm);
        return cost;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double fixedCost = 200;
        System.out.println("Enter the number of days");
        double numDay = input.nextDouble();
        System.out.println("Enter the number of kn travelled");
        double numKm = input.nextDouble();
        System.out.println("Enter spesific amount");
        double spesificAmt = input.nextDouble();

        Trailer tr = new Trailer(fixedCost, spesificAmt, numDay, numKm);
        
        System.out.println("The total is "+tr.calcCost(spesificAmt, numDay, numKm));
    }

}
