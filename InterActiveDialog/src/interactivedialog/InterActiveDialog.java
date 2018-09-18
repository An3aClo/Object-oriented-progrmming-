/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactivedialog;

import javax.swing.*;

/**
 *
 * @author andre
 */
public class InterActiveDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter name");
        String sname = JOptionPane.showInputDialog("Enter surname");
        double age = Double.parseDouble(JOptionPane.showInputDialog("Enter age"));
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter number"));

        
    }

}
