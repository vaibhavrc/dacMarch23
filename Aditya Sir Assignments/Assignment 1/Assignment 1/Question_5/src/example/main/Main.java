package example.main;
/*
 Problem Statement 5:
You are given a string s that contains a sentence. Write a Java function that counts the number of 
words in the sentence. The function should take the string as input and return the count of words 
in the sentence. The function should handle input that contains non-alphabetic characters and 
prompt the user to re-enter valid input.
For example, if the user inputs "The quick brown fox jumps over the lazy dog", the function should 
print "The sentence contains 9 words".
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String args[]) throws IOException{
		// TODO Auto-generated method stub
		String str1;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String:");
		str1=reader.readLine();
		String[] words = str1.split("[ !\"\\#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]+");
		System.out.println("The sentence contains "+words.length+" words");
	}
}

/*
Enter String:
Java is a simple language.
The sentence contains 5 words
*/