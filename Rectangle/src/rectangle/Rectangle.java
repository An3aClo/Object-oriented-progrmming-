package rectangle;

import java.util.Scanner;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double w, double l) {
        width = w;
        length = l;
    }

    public double area(double width, double length) {
        double area = length * width;
        return area;
    }
    
    public double getLength(){
    return length;
    }
    
    public double getWidth(){
    return width;
    }
    
    public static void main(String[] args) {

    }

}
