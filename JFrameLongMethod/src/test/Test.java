package test;

import javax.swing.*;
import java.awt.*;

public class Test {

    private JFrame f;
    private JPanel p;
    private JButton b1;
    private JLabel lab;
    
    public Test(){
    gui();
    }
    public void gui(){
    f=new JFrame("Awsome");
    f.setVisible(true);
    f.setSize(600,400);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    p=new JPanel();
    p.setBackground(Color.RED);
    
    b1=new JButton("Test");
   
    lab=new JLabel("Name");
    
    p.add(b1);
    p.add(lab);
    
    f.add(p);
    
    
    }
    public static void main(String[] args) {
        new Test();

    }

}
