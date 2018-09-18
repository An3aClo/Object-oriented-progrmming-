package rectangle;

import java.util.Scanner;

public class Rectangle {
    
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double area(double lenght, double width) {
        double area = length * width;
        return area;
    }
    
    public void setLength() {
        this.length = length;
    }
    
    public double getLength() {
        
        return length;
    }
    
    public void setWidth() {
        this.width = width;
    }
    
    public double getWidth() {
        
        return width;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter lenght");
        double lenght = input.nextDouble();
        
        System.out.println("Enter width");
        double width = input.nextDouble();
        
        System.out.println("Enter depth");
        double depth = input.nextDouble();
        
        System.out.println("Enter height");
        double height = input.nextDouble();
        
        Rectangle r = new Rectangle(lenght, width);
        Box b = new Box(depth);
        
        System.out.println("The area of the rec is " + r.area(lenght, width));
        System.out.println("The are of the box is " + b.area(depth, lenght, width));
        System.out.println("The volume is " + b.volume(height, lenght, width));
        
    }
    
}
