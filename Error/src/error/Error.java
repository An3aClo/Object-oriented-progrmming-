package error;

import javax.swing.*;

public class Error {

    private int num1;
    private int num2;

    public Error(int n1, int n2) {

        n1 = num1;
        n2 = num2;
    }

    public int divide() {

        int x=num1/num2;

        try {
            x = num1 / num2;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        return x;
    }

    public void displayAll() {

        JOptionPane.showMessageDialog(null, divide());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter firts number"));
        int num2= Integer.parseInt(JOptionPane.showInputDialog("Enter second umber"));
        
       Error er= new Error(num1,num2);
       er.displayAll();

    }

}
