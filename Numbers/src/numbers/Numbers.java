package numbers;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Numbers {

    private int num;

    public Numbers(int num) {
        this.num = num;
    }

    public double half(int num) {
        double half = num / 2;
        return (double)half;
    }

    public double quater(int num) {
        double quater = num / 4;
        return (double)quater;
    }

    public double third(int mun) {
        double third = num / 3;
        return (double)third;
    }

    public void displayAll() {
        System.out.println("The number in half : " + half(num));
        System.out.println("The number in quater : " + quater(num));
        System.out.println("The number in third : " + third(num));
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
        Scanner input = new Scanner(System.in);

//        System.out.println("Enter any integer");
//        int num = input.nextInt();
        Numbers n = new Numbers(num);
        n.displayAll();

    }

}
