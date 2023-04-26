package example.main;
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
		System.out.println("Original String:"+str1);
		System.out.println("Reversed String:"+str2);
	}
}

/*
Enter String:
hello world
Original String:hello world
Reversed String:dlrow olleh
*/