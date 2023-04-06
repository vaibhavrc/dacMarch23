import java.util.Scanner;
import java.time.LocalDate;
class CustomDate{
    String day;
    String month;
    String year;
    int Day;
    int Month;
    int Year;
    Scanner sc=new Scanner(System.in);
    void getDate(){
        System.out.println("Enter day dd:");
        this.day=sc.nextLine();
        this.Day=Integer.parseInt(this.day);
        System.out.println("Enter month mm:");
        this.month=sc.nextLine();
        this.Month=Integer.parseInt(this.month);
        System.out.println("Enter Year yyyy:");
        this.year=sc.next();
        this.Year=Integer.parseInt(this.year);
    }
    boolean isValid(){
        if ((this.Day>0)&&(this.Day<=31)){
            if ((this.Month>0)&&(this.Month<=12)){
                if((this.Year>0)&&(this.Year<=9999)){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    void getDayOfWeek(){
        if (this.isValid()){
        String ip=this.year+"-"+this.month+"-"+this.day;
        LocalDate ldf=LocalDate.parse(ip);
        System.out.println("Day of Week is:"+ldf.getDayOfWeek());
        }
        else{
            System.out.println("Invalid Date format");
        }
    }
    boolean isLeapYear(){
        if (this.Year%4==0){
            if(this.Year%100==0){
                if(this.Year%400==0){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    void getNextDay(){
        if ((this.Month==1)||(this.Month==3)||(this.Month==5)||(this.Month==7)||(this.Month==8)||(this.Month==10)||(this.Month==12)){
            if(this.Day==31){
                if (this.Month==12){
                    int year=this.Year+1;
                    System.out.println("Next Day: 01-01-"+year);
                }
                else {
                int month=this.Month+1;
                System.out.println("Next Day: 01-"+month+"-"+this.Year);
                }
            }
            else {
                int day=this.Day+1;
                System.out.println("Next Day:"+day+"-"+this.Month+"-"+this.Year);
            }
        }
        if ((this.Month==4)||(this.Month==6)||(this.Month==9)||(this.Month==11)){
            if(this.Day==30){
                int month=this.Month+1;
                System.out.println("Next Day: 01-"+month+"-"+this.Year);
                }
            else {
                int day=this.Day+1;
                System.out.println("Next Day:"+day+"-"+this.Month+"-"+this.Year);
            }
        }
        if (this.Month==2){
            if(this.isLeapYear()){
                if(this.Day==29){
                    int month=this.Month+1;
                    System.out.println("Next Day: 01-"+month+"-"+this.Year);
                    }
                else {
                    int day=this.Day+1;
                    System.out.println("Next Day:"+day+"-"+this.Month+"-"+this.Year);
                }
            }
            else {
                if(this.Day==28){
                    int month=this.Month+1;
                    System.out.println("Next Day: 01-"+month+"-"+this.Year);
                    }
                else {
                    int day=this.Day+1;
                    System.out.println("Next Day:"+day+"-"+this.Month+"-"+this.Year);
                }
            }
        }
    }
    void getPreviousDay(){
        if ((this.Month==4)||(this.Month==6)||(this.Month==9)||(this.Month==11)){
            if(this.Day==1){
                int month=this.Month-1;
                System.out.println("previous Day: 31-"+month+"-"+this.Year);
                }
            else {
                int day=this.Day-1;
                System.out.println("Previous Day:"+day+"-"+this.Month+"-"+this.Year);
            }
        }
        if ((this.Month==1)||(this.Month==2)||(this.Month==5)||(this.Month==7)||(this.Month==8)||(this.Month==10)||(this.Month==12)){
            if(this.Day==1){
                if (this.Month==1){
                    int year=this.Year-1;
                    System.out.println("Previous Day: 31-12-"+year);
                }
                else {
                int month=this.Month-1;
                System.out.println("Previous Day: 30-"+month+"-"+this.Year);
                }
            }
            else {
                int day=this.Day-1;
                System.out.println("Previous Day:"+day+"-"+this.Month+"-"+this.Year);
            }
        }
        if (this.Month==3){
            if(this.isLeapYear()){
                if(this.Day==1){
                    int month=this.Month-1;
                    System.out.println("Previous Day: 29-"+month+"-"+this.Year);
                    }
                else {
                    int day=this.Day-1;
                    System.out.println("Previous Day:"+day+"-"+this.Month+"-"+this.Year);
                }
            }
            else {
                if(this.Day==1){
                    int month=this.Month-1;
                    System.out.println("Previous Day: 28-"+month+"-"+this.Year);
                    }
                else {
                    int day=this.Day-1;
                    System.out.println("Previous Day:"+day+"-"+this.Month+"-"+this.Year);
                }
            }
        }

    }
}

public class DateClass {
    public static void main(String[] args) {
        CustomDate d1=new CustomDate();
        d1.getDate();
        d1.isValid();
        d1.getDayOfWeek();
        d1.isLeapYear();
        d1.getNextDay();
        d1.getPreviousDay();
    }
    
}
