package example.main;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int size = 0;
			System.out.println("Enter array size:");
			size=sc.nextInt();
			int[] arr=new int[size];
			System.out.println("Enter array elements:");
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			int sum=0;
			for(int i=0;i<size;i++) {
				sum+=arr[i];
			}
			System.out.println("The sum of the elements in the array is: "+sum);
		}
	}
}

/*
Enter array size:
5
Enter array elements:
1
2
3
4
5
The sum of the elements in the array is: 15
*/