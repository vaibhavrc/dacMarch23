/*
 * Problem Statement 1:
You are given a positive integer n. Write a Java function that counts the number of digits in
the number. However, you are not allowed to convert the number to a string, use any
mathematical formula or log function, or use any inbuilt functions. The function should take
the integer n as input and return the number of digits in the number.
Example output:
Input: 12345
Output: Number of digits: 5
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int count=0;
		while(n>0) {
			n=n/10;
			count+=1;
		}
		System.out.println("Number of digits are:"+count);

	}

}

/*
 * Output:
 * Number of digits are:4
 */