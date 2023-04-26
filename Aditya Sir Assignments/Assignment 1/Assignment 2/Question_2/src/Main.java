/*
Problem Statement 2:
You are given a positive integer n. Write a Java function that counts the number of even and
odd digits in the number. However, you are not allowed to convert the number to a string,
use any mathematical formula or log function, or use any inbuilt functions. The function
should take the integer n as input and return the number of even and odd digits in the number.
Example output:
Input: 24689
Output: Number of even digits: 4, Number of odd digits: 1
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123466;
		int evenCount=0;
		int oddCount=0;
		while(n>0) {
			if(((n%10)%2==0))
				evenCount+=1;
			else
				oddCount+=1;
			n=n/10;
		}
		System.out.println("Number of even digits :"+evenCount+", Number of odd digits: "+oddCount);
	}

}

/*
 * Output:
 * Number of even digits :4, Number of odd digits: 2
 */