package matt;

import javax.swing.*;

public class Matt {

    
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter name");
        String surname = JOptionPane.showInputDialog("Enter surname");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height"));
        int weight = Integer.parseInt(JOptionPane.showInputDialog("Enter weight"));
        double bmi = weight / Math.pow(height, 2);

        JOptionPane.showMessageDialog(null, name + " " + surname + " your bmi is " + (int) bmi);

    }

}
