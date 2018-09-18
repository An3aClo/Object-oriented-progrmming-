/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape1;
import java.util.Scanner;
/**
 *
 * @author andre
 */
public abstract class Shape1 {

    private double area;
    
    public void display(){
    
        System.out.println("The area is "+ area);
    }
    
    public abstract double calcArea();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
     System.out.println("Enter base");
     double base=input.nextDouble();
      System.out.println("Enter height");
     double height=input.nextDouble();
      System.out.println("Enter radius");
     double radius=input.nextDouble();
     
     Triangle t= new Triangle();
     Circle c= new Circle();
     
     c.calcArea();
     c.display();
     t.calcArea();
     t.display();
     
    }
    
}
