package classassignment;

import javax.swing.*;

public class ClassAssignment extends JFrame {

    public ClassAssignment(String x) {
        setTitle(x);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel name = new JLabel("Name");
        JTextField nameF = new JTextField(16);

        JLabel surname = new JLabel("Surname");
        JTextField surnameF = new JTextField(16);

        JLabel age = new JLabel("Age");
        JTextField ageF = new JTextField(10);

        JButton update = new JButton("Update");
        JButton cancel = new JButton("Cancel");
        //ridLayout g1=new GridLayout(0,2);
        JPanel panel = new JPanel();

        panel.add(name);
        panel.add(surname);
        panel.add(age);
        panel.add(nameF);
        panel.add(surnameF);
        panel.add(ageF);
        panel.add(update);
        panel.add(cancel);

        getContentPane().add(panel);
        pack();
        setVisible(true);
        

    }

    public static void main(String[] args) {
        ClassAssignment ca = new ClassAssignment("Class Assignment");
        ca.setBounds(200,200, 400, 400);

    }

}
