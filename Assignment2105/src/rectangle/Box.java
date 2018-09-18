package rectangle;

public class Box {

    private double depth;

    public Box(double depth) {

        this.depth = depth;
    }

    public double area(double depth, double length, double width) {
        double area = (2 * length * width) + (2 * width * depth) + (2 * length * depth);
        return area;
    }

    public double volume(double height, double length, double width) {

        double volume = length * height * width;
        return volume;

    }

}
