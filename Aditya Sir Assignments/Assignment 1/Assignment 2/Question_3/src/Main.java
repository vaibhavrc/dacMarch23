/*
Problem Statement 3:
You are given a positive integer n. Write a Java function that counts the sum of digits in the
number. However, you are not allowed to convert the number to a string, use any
mathematical formula or log function, or use any inbuilt functions. The function should take
the integer n as input and return the sum of digits in the number.
Example output:
Input: 4567
Output: Sum of digits: 22
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123466;
		System.out.println("Input: "+n);
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n=n/10;
		}
		System.out.println("Output: Sum of digits "+sum);
	}

}

/*
 * Output:
 * Input: 123466
   Output: Sum of digits 22
 */