/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class Triangle extends AbstractShape {

    private double base;

    public Triangle(double b) {
        base = b;

    }

    public double calcNet() {
        area = base * base;
        return area;
    }

}
