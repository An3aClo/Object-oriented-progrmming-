/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class Cow implements Mammal {

    private String breed;

    public void move() {
        System.out.println("At day");
    }
    
    public static void main(String []args){
    
    Cow c= new Cow();
    Bat b= new Bat();
    
    c.move();
    b.move();
            
    }

}
