package employee1;

public class LabTech extends Employee1 {

    private String name;
    private double grossPay;

    @Override
    public double CalcNet(double grossPay) {
        double netPay = grossPay - (grossPay * 0.14);
        return netPay;

    }

}
