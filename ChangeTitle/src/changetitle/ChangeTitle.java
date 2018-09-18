/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package changetitle;

import java.awt.event.*;
import javax.swing.*;

public class ChangeTitle extends JFrame implements ActionListener {

    JButton b1 = new JButton("Long Street");
    JButton b2 = new JButton("Cavendish");

    public ChangeTitle() {
        super("Title Bar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(this);
        b2.addActionListener(this);
        JPanel panel = new JPanel();

        panel.add(b1);
        panel.add(b2);
        getContentPane().add(panel);
        pack();
        setVisible(true);

    }

    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
        if (source.equals(b1)) {
            setTitle("Long street");
        } else if (source.equals(b2)) {
            setTitle("Claremont");
        }
        repaint();
    }

    public static void main(String[] args) {
        ChangeTitle frame = new ChangeTitle();
    }

    

}
