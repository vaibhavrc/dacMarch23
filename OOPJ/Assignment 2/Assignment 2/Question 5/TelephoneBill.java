import java.util.Scanner;

class Customer{
    String CustomerName;
    int PhoneNumber;
    int NoOfCalls;
    double CallDuration;
    double billAmount;
    Scanner sc=new Scanner(System.in);

    void setDetails(){
        System.out.println("Enter Customer Name:");
        this.CustomerName=sc.nextLine();
        System.out.println("Enter Phone Number:");
        this.PhoneNumber=sc.nextInt();
        System.out.println("Enter Number of Calls:");
        this.NoOfCalls=sc.nextInt();
        System.out.println("Enter Call Duration Minutes");
        this.CallDuration=sc.nextFloat();
    }
    void calculateBill(){
        if (this.NoOfCalls<=100){
            this.billAmount=100*0.5;
        }
        else{
            this.billAmount=((this.NoOfCalls-100)*0.25+100*0.5);
        }
        System.out.println("Total Bill Amount is:"+(this.billAmount+10));
    }
}

public class TelephoneBill {
    public static void main(String[] args) {
        Customer cust1=new Customer();
        cust1.setDetails();
        cust1.calculateBill();
    }   
}
