import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DateFormat{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Date yyyy-mm-dd:");
        String ipdate=sc.nextLine();
        System.out.println("Enter Time hh:mm:ss");
        String iptime=sc.nextLine();
        String ip=ipdate+"T"+iptime;
        LocalDateTime ldf=LocalDateTime.parse(ip);
        System.out.println("Pattern dd/mm/yyyy:");
        System.out.println(ldf.format(DateTimeFormatter.ofPattern("dd/mm/yyyy")));   
        System.out.println("Pattern mm/dd/yyyy:");
        System.out.println(ldf.format(DateTimeFormatter.ofPattern("mm/dd/yyyy")));
        System.out.println("Pattern yyyy/mm/dd:");
        System.out.println(ldf.format(DateTimeFormatter.ofPattern("yyyy/mm/dd")));
        System.out.println("Pattern hh:mm:ss:");
        System.out.println(ldf.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        System.out.println("Pattern hh:mm:ss a:");
        System.out.println(ldf.format(DateTimeFormatter.ofPattern("hh:mm:ss a")));
        System.out.println("Pattern hh:mm:");
        System.out.println(ldf.format(DateTimeFormatter.ofPattern("hh:mm")));
    }    
}
