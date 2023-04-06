import java.util.Scanner;
class RationalNumber{
    int num1;
    int den1;
    int num2;
    int den2;
    int numo;
    int deno;
    Scanner sc=new Scanner(System.in);
    void readNumbers(){
        System.out.println("Enter Numerator 1:");
        this.num1=sc.nextInt();
        System.out.println("Enter Denimonator 1:");
        this.den1=sc.nextInt();
        System.out.println("Enter Numerator 2:");
        this.num2=sc.nextInt();
        System.out.println("Enter Denominator 2:");
        this.den2=sc.nextInt();
    }
    void performOperations(){
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("0. Exit");
        int choice=sc.nextInt();
        while(choice!=0){
            switch(choice){
                case 1: this.numo=((num1*den2)+(num2*den1));
                        this.deno=den1*den2;
                        System.out.println("Numerator:"+numo);
                        System.out.println("Denominator:"+deno);
                        break;
                case 2: this.numo=((num1*den2)-(num2*den1));
                        this.deno=den1*den2;
                        System.out.println("Numerator:"+numo);
                        System.out.println("Denominator:"+deno);
                        break;
                case 3: this.numo=num1*num2;
                        this.deno=den1*den2;
                        System.out.println("Numerator:"+numo);
                        System.out.println("Denominator:"+deno);
                        break;
                case 4: this.numo=num1*den2;
                        this.deno=num2*den1;
                        System.out.println("Numerator:"+numo);
                        System.out.println("Denominator:"+deno);
                        break;
                default:
                        System.out.println("Invalid Number");
            }
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            choice=sc.nextInt();
        }

    }
    

}

public class RationalNumberCalculator {
    public static void main(String[] args) {
    RationalNumber r1=new RationalNumber();
    r1.readNumbers();
    r1.performOperations();   
}
}
