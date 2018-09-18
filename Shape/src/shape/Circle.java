package shape;

public class Circle extends Shape{
    
    private double radius;
    
    public Circle (double r){
    radius =r;
    }
    
    public double calcArea(){
     area=Math.PI*Math.pow(radius,2); 
     return area;
    }
    
}
