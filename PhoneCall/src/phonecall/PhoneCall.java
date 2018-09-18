package phonecall;

import java.util.Scanner;

public class PhoneCall {

    private int min;
    private double price;

    private double addCost;

    public PhoneCall(int m, double p, double a) {
        min = m;
        price = p;
        addCost = a;

    }

    public double calcNet(int min, int price, int addCost) {
         double total;
        if (min>3){
        total = ((3 * price) + ((min - 3) * addCost)) + (((3 * price) + ((min - 3) * addCost)) * 0.14);
        }else
            total= (min*16.67)+((min*16.67)*0.14);
        return total;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double price = 0.50;
        double addCost = 0.15;

        System.out.println("Enter minutes");
        int min = input.nextInt();

        PhoneCall pc = new PhoneCall(min, price, addCost);

        System.out.println("The cost is " + pc.calcNet(min, min, min));

    }

}
