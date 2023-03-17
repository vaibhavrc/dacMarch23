import java.util.Scanner;
class compare{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num1:");
		int num1=sc.nextInt();
		System.out.println("Enter num2:");
		int num2=sc.nextInt();
		int output=(num1>=num2)?(num1+num2):(num1-num2);
		System.out.println("For numbers: "+num1+","+num2+" output is: "+output);
	}
}