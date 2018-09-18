package myjframe;

import javax.swing.*;

public class MyJFrame extends JFrame {

    public MyJFrame() {
        super("MY JFRAME");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l = new JLabel("Name");
        JButton b = new JButton("Close");
        JPanel p = new JPanel();

        p.add(l);
        p.add(b);

        getContentPane().add(p);
        pack();
        setVisible(true);
        setBounds(600, 400, 450, 700);
    }

    public static void main(String[] args) {
        MyJFrame mjf = new MyJFrame();

    }

}
