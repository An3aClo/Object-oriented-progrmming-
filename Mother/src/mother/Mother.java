/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mother;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Mother {

    private String surname;

    public Mother(String surname) {

        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter surname");
        String surname = input.next();

        System.out.println("Enter sons name");
        String sname = input.next();

        Mother m = new Mother(surname);

        Boy b = new Boy(surname, sname);

        b.displayAll();

    }

}

class Boy extends Mother {

    String name;

    public Boy(String surname, String name) {

        super(surname);
        this.name = name;

    }

    public void displayAll() {

        System.out.println("The soons name is " + this.name + " " + getSurname());

    }

}
