import java.util.Scanner;
class gradeSystem{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total marks:");
		float total_marks=sc.nextFloat();
		System.out.println("Enter Obtained marks:");
		float obtain_marks=sc.nextFloat();
		float percentage=(obtain_marks/total_marks)*100;
		String grade="";
		if (percentage>95){
			grade="Distinction";
		}else if (percentage>=85){
			grade="First division";
		}else if (percentage>=75){
			grade="Second division";
		}else if (percentage<75){
			grade="Average";
		} 
		System.out.println("Grade for "+obtain_marks+"/"+total_marks+" is: "+grade);	
	}
}