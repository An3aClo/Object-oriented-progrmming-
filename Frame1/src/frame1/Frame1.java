/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame1;
import javax.swing.*;
/**
 *
 * @author andre
 */
public class Frame1 extends JFrame{

    public Frame1(){
    
        setTitle("Hello");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        JButton b= new JButton("Hi");
        JLabel l= new JLabel("Shh");
        JPanel panel= new JPanel();
        
        panel.add(b);
        panel.add(l);
        
        getContentPane().add(panel);
        pack();
        setVisible(true);
        setBounds(200,200,200,200);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Frame1 f= new Frame1();
    }
    
}
