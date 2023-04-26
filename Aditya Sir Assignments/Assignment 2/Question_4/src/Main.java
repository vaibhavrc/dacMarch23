/*
Problem Statement 4:
You are given a string s containing alphanumeric characters and special characters. Write a
Java function that removes all the special characters from the string. The function should take
the string as input and return the modified string.
Example Input: "He#llo $Wo%rld!"
Example Output: "HelloWorld"
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="He#llo $Wo%rld!";
		System.out.println("Input: "+str);
		str=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("Output: "+str);
	}

}

/*
 * Output:
 * Input: He#llo $Wo%rld!
   Output: HelloWorld
 */