import java.util.Scanner;
class CreditScore{
    int CreditHistory;
    double CreditUtilization;
    boolean PaymentHistory;
    double CreditScore;
    CreditScore(){
        this(0,0,false);
    }
    CreditScore(int CreditHistory,double CreditUtilization,boolean PaymentHistory){
        this.CreditHistory=CreditHistory;
        this.CreditUtilization=CreditUtilization;
        this.PaymentHistory=PaymentHistory;
    }
    void setCreditHistory(int CreditHistory){
        this.CreditHistory=CreditHistory;
    }
    void setCreditUtilization(double CreditUtilization){
        this.CreditUtilization=CreditUtilization;
    }
    void setPaymentHistory(boolean PaymentHistory){
        this.PaymentHistory=PaymentHistory;
    }
    double calculateCreditScore(){
        if (this.PaymentHistory==true){
            this.CreditScore=(this.CreditHistory*15)+(int)(this.CreditUtilization*30)+55;
        }
        else{
            this.CreditScore=(this.CreditHistory*15)+(int)(this.CreditUtilization*30)+35;
        }
        return this.CreditScore;
    }
}
class CreditGetSet{
    CreditScore cs=new CreditScore();
    Scanner sc=new Scanner(System.in);
    void acceptRecord(){
        System.out.println("Enter Credit History:");
        cs.setCreditHistory(sc.nextInt());
        System.out.println("Enter Credit Utilization");
        cs.setCreditUtilization(sc.nextDouble());
        System.out.println("Enter Payment History Bad:false Good:true");
        cs.setPaymentHistory(sc.nextBoolean());
    }
    void printRecord(){
        System.out.println("Customer Details are:");
        System.out.println("Credit History:"+cs.CreditHistory);
        System.out.println("Credit Utilization:"+cs.CreditUtilization);
        System.out.println("Payment History:"+cs.PaymentHistory);
    }
    void calculateCreditScore(){
        System.out.println("Credit Score is:"+cs.calculateCreditScore());
    }
}
class CreditScoreCalculator{
    public static void main(String[] args) {
        CreditGetSet cgs=new CreditGetSet();
        cgs.acceptRecord();
        cgs.printRecord();
        cgs.calculateCreditScore();
    }
}