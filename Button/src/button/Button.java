/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package button;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author andre
 */
public class Button extends JFrame implements ActionListener {

    JButton b = new JButton("Upadte");
    JButton b2 = new JButton("Cancel");
    JLabel l = new JLabel("Name");

    public Button() {
        super("Frame name");
        b.addActionListener(this);
        b2.addActionListener(this);
        JPanel p = new JPanel();

        p.add(l);
        p.add(b);
        p.add(b2);

        getContentPane().add(p);
        pack();
        setVisible(true);
        setBounds(400, 400, 400, 400);

    }
    
    public void actionPerformed(ActionEvent evt){
    
        Object source= evt.getSource();
        if(source.equals(b))
            setTitle("Button 1");
        else 
            setTitle("Button 2");
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Button b = new Button();
        
        // TODO code application logic here
    }

}
