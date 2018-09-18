/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststring;
import java.util.Scanner;
/**
 *
 * @author andre
 */
public class TestString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in= new Scanner(System.in);
    
        System.out.println("Enter a String");
        String s= in.nextLine();
            System.out.println("Upper case " + s.toUpperCase());
        System.out.println("Upper case " + s.trim().toUpperCase());
        System.out.println("Lower case "+ s.toLowerCase());
        System.out.println("At position 2 we have "+s.charAt(2));
        System.out.println("A is at "+s.indexOf("A"));
        String s1="Rene";
        System.out.println("Compare to "+s1+"Neg is smaller pos is greater" +s.compareTo(s1));
        System.out.println("Lenght "+s.length());
        if(!s.isEmpty())
            System.out.println("Not emmpty");
        else
            System.out.println("Is empty");
        System.out.println(s+" Sub String(2,6) "+ s.substring(2,6));
        System.out.println("Trim "+s.trim());

    }
    
}
