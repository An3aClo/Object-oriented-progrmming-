package company;

public class Employee extends Company{
    
    private String name;
    private double grossPay;
    
    @Override
    public double calcNet(double grossPay){
    double netPay=grossPay-(grossPay*0.14);
        return netPay;
    }
    
    
}
