package shape;

public class Triangle extends Shape {

    private double base;
    private double height;

    public Triangle(double b, double h) {
        base = b;
        height = h;
    }

    @Override
    public double calcArea() {
        area = base * height;
        return area;
    }

}
