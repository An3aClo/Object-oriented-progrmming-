/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import javax.swing.*;

/**
 *
 * @author andre
 */
public class Frame extends JFrame {

    public Frame(String x) {
        setTitle(x);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel l= new JLabel("Name");
        JButton b= new JButton("Help");
        JPanel panel= new JPanel();
        
        panel.add(l);
        panel.add(b);
        
        getContentPane().add(panel);
        pack();
        setVisible(true);
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String x= "My Frame";
        Frame f= new Frame(x);
    }

}
