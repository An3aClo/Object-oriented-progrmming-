package company;

public abstract class Company {
    
    double netPay;
    
    public abstract double calcNet(double grossPay);
    

    public static void main(String[] args) {
        String name="Ndai";
        Double grossPay=20.50;
        
        Employee emp=new Employee();
        
        System.out.println(name+" your net pay is: R"+emp.calcNet(grossPay));
    }
    
}
