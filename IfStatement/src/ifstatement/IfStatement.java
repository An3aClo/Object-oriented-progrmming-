/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifstatement;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class IfStatement {

    private int line;

    public IfStatement(int l) {
        l = line;
    }

    public void Triangle(int line) {
        for (int row = 0; row <= line; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of lines");
        int line= input.nextInt();
        
        IfStatement is=new IfStatement(line);
        is.Triangle(line);

    }

}
