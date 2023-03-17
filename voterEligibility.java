import java.util.Scanner;
class voterEligibility{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("Enter country name:");
		String country=sc.next();
		String voting_status=(age>=18 && country.equals("India"))?"Voter is eligible":"Voter is not eligible";
		System.out.println(voting_status);
	}
}