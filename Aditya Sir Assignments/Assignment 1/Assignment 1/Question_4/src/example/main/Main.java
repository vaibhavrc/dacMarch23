package example.main;
/*
 Problem Statement 4:
You are given a string s. Write a Java function that checks whether the string is a palindrome or 
not. The function should take the string as input and return true if the string is a palindrome, 
and false otherwise. The function should handle input that contains non-alphabetic characters and 
prompt the user to re-enter valid input.
For example, if the user inputs "racecar", the function should print "The string is a palindrome". 
If the user inputs "hello", the function should print "The string is not a palindrome".
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String args[]) throws IOException{
		// TODO Auto-generated method stub
		String str1;
		String str2 = "";
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String:");
		str1=reader.readLine();
		for(int i=str1.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
		}
		if(str1.equals(str2)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}
}

/*
Enter String:
abc
String is not palindrome

Enter String:
abcba
String is palindrome
*/