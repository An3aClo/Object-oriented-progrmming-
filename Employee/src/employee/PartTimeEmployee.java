package employee;

public class PartTimeEmployee extends Employee {

    private double hourlyRate;

    @Override
    public double CalculateTax(double gross, double hours) {
        hourlyRate = 200;
        double tax;
        if (hours <= 10) {
            tax = ((hours * hourlyRate) * 0.05);
        } else {
            tax = ((hours * hourlyRate) * 0.075);
        }
        return tax;
    }

    @Override
    public double CalculateNet(double gross, double hours) {
        hourlyRate = 200;
        double net = (hourlyRate * hours) - CalculateTax(gross, hours);
        return net;
    }

    public double accumulateTax(double hours) {
      double aTax = CalculateTax(gross,hours) * 4;
        return aTax;
    }

    public double accumulateNet( double hours) {
        double aNet = CalculateNet(gross, hours) * 4;
        return aNet;
    }
}


