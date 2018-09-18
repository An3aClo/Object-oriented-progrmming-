package employee;

//import emp1.Emp1;

public class FullTimeEmployee extends Employee {

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getGross() {
        return gross;
    }

    public void setName() {
        name = name;
    }

    public void setSurname() {
        surname = surname;
    }

    public void setGross() {
        gross = gross;
    }

    @Override
    public double CalculateTax(double gross, double hours) {
        double tax = gross * 0.11;
        return tax;
    }

    @Override
    public double CalculateNet(double gross, double hours) {

        double net = gross - CalculateTax(gross, hours);
        return net;
    }

}
