/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class NewClass extends AbstractShape{
    
    private double radius;
    
    public NewClass(double radius){
    this.radius= radius;
    }
    public double calcNet(){
    area=radius*radius;
    return area;
    }
}
