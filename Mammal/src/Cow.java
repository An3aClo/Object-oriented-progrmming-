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

    String bread = "Milk cow";

    public void moves() {
        System.out.println("The " + bread + " moves in daytime ");
    }

   public static void main(String[] args) {
        Cow c = new Cow();
        Bat b = new Bat();

        c.moves();
        b.moves();

    }
}
