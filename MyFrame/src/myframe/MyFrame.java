package myframe;

import javax.swing.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        
        //setTitle(x);
        //super("My first frame");
       setBounds(100, 500, 600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lable = new JLabel("Name");//just a constructer not paramaterised
        JButton button = new JButton("HELP");
        JPanel panel = new JPanel();
        JLabel lable2 = new JLabel("Surname");
        JButton button2=new JButton("CLOSE");

        panel.add(lable);
        panel.add(button);
        panel.add(lable2);
        panel.add(button2);

        getContentPane().add(panel);
        pack();
        setVisible(true);

    }

    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
mf.setTitle("Frame");
    }

}
