/*
Problem Statement 5:
You are given a string s containing spaces between words. Write a Java function that removes
all the spaces from the string. The function should take the string as input and return the
modified string
Example Input: "The quick brown fox"
Example Output: "Thequickbrownfox"
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="The quick brown fox";
		System.out.println("Input: "+str);
		str=str.replaceAll("[ ]","");
		System.out.println("Output: "+str);
	}

}

/*
 * Output:
 * Input: The quick brown fox
Output: Thequickbrownfox
 */