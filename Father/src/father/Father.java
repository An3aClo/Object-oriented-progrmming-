/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package father;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class Father {

    private String surname;

    public Father(String surname) {

        this.surname = surname;
    }

    public String getSurname() {

        return surname;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter name");
        String name = input.next();
        System.out.println("Enter surname");
        String surname = input.next();
        
        Father f= new Father(surname);
        Son s= new Son(surname,name);
        
      //  s.display();
        System.out.println("The sos name is "+name+ " "+ surname);

    }

}

class Son extends Father {

    private String name;

    public Son(String surname, String name) {
        super(surname);
        this.name = name;
    }

    public String getName() {

        return name;
    }
    
   // public void display(){
    
     //   System.out.println("The sos name is "+name+ " "+ super.getSurname());
   // }

}
