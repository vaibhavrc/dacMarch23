package example.main;
import java.util.Scanner;
/* 
Problem Statement 1:
You are given two integer variables, a and b. Write a Java function that swaps the values of a and b. The function should not use a third variable. The function should take two integer arguments and return the swapped values.
For example, if the user inputs a=5 and b=10, the function should print "a=10, b=5".
*/
class Program {
    public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
				int a,b;
				System.out.println("Enter number 1:");
				a=sc.nextInt();
				System.out.println("Enter number 2:");
				b=sc.nextInt();
				System.out.println("Before swapping a:"+a+" b:"+b);
				a=a+b;
				b=a-b;
				a=a-b;
				System.out.println("After swapping a:"+a+" b:"+b);
			}
    }
}

/*
Enter number 1:
1
Enter number 2:
2
Before swapping a:1 b:2
After swapping a:2 b:1
*/