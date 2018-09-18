/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import javax.swing.*;
/**
 *
 * @author andre
 */
public class GUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String name= JOptionPane.showInputDialog("Enter name");
        String surname= JOptionPane.showInputDialog("Enter surname");
        
        int age= Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
        
        double height= Double.parseDouble(JOptionPane.showInputDialog("Enter height"));
        
        JOptionPane.showMessageDialog(null,"Hi");
    }
    
}
