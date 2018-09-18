
public class BMI implements Health {

    private double weight;
    private double height;

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public double calculateBMI() {
        double bmi = weight / (height * height);
        return (int)bmi;
    }
    public static void main (String [] args){
    
    
    BMI bmi=new BMI(76,1.8);
    System.out.println("Your BMI is "+bmi.calculateBMI());
    
    }
    
    
}




