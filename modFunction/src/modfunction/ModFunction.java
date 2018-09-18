/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modfunction;

/**
 *
 * @author andre
 */
public class ModFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String[][] a= new String[][]{{"x","x","x"},{"o","o","o"},{"y","y","y"}};
       for(int row=0;row<3;row++){
       for(int col=0; col<3; col++){
           System.out.print(a[row][col]);
           
       }
       System.out.println();
       }
    }
    
}
