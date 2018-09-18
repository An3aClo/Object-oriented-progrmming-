package shape;

import java.util.Scanner;

public abstract class Shape {

    double area;

    public void displayAll() {
        System.out.println("The area is " + area);
    }

    public abstract double calcArea();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double height, radius, base;

        System.out.println("Enter the base");
        base = input.nextDouble();

        System.out.println("Enter the height");
        height = input.nextDouble();

        System.out.println("Enter the radius");
        radius = input.nextDouble();

        Triangle t = new Triangle(base, height);
        Circle c = new Circle(radius);
        t.calcArea();
        t.displayAll();
        c.calcArea();
        c.displayAll();
    }

}
