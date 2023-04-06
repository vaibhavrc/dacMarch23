import java.util.Scanner;


class BMICalculator{
    float weight;
    float height;
    Scanner sc=new Scanner(System.in);
    void setWeightHeight(){
        System.out.println("Enter Weight Kg:");
        this.weight=sc.nextFloat();
        System.out.println("Enter Height Cm:");
        this.height=sc.nextFloat();
    }
    float calculateBMI(){
        return ((this.weight)/(this.height*this.height));
    }

}
public class Question2 {
    public static void main(String[] args) {
    BMICalculator bmc=new BMICalculator();
    bmc.setWeightHeight();
    float bmi=bmc.calculateBMI();
    System.out.println("BMI is:"+bmi);
    }
}
