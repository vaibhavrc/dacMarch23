class patterns{
	public static void main(String args[]){
		System.out.println("Pattern 1:");
		int i,j=0;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 2:");
		i=0;
		j=0;
		int ascii=64;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print((char)(ascii+j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 3:");
		i=0;
		j=0;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 4:");
		i=0;
		j=0;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("Pattern 5:");
		i=0;
		j=0;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print((char)(ascii+i)+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 6:");
		i=0;
		j=0;
		int k=0;
		for(i=1;i<=5;i++){
			for(k=1;k<=(2*(5-i));k++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(" *");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 7:");
		i=0;
		j=0;
		k=0;
		for(i=1;i<=5;i++){
			for(k=1;k<=((5-i));k++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 8:");
		i=0;
		j=0;
		k=0;
		for(i=5;i>=0;i--){
			for(k=1;k<=i;k++){
				System.out.print(" ");
			}
			//System.out.println("k:"+k);
			for(j=i;j<=5;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 9:");
		i=0;
		j=0;
		k=0;
		for(i=1;i<=5;i++){
			for(k=1;k<=5-i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print((char)(ascii+j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 10:");
		i=0;
		j=0;
		k=0;
		for(i=5;i>=0;i--){
			for(k=1;k<=i;k++){
				System.out.print(" ");
			}
			for(j=0;j<=5-i;j++){
				System.out.print((char)(ascii+i+j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 11:");
		i=0;
		j=0;
		k=0;
		for(i=0;i<5;i++){
			for(k=1;k<=5-i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=i*2+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 12:");
		i=0;
		j=0;
		k=0;
		for(i=1;i<=5;i++){
			for(k=1;k<=((5-i));k++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 13:");
		i=0;
		j=0;
		k=0;
		for(i=1;i<=5;i++){
			for(k=1;k<=5-i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print((char)(ascii+i)+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 14:");
		i=0;
		j=0;
		k=0;
		for(i=5;i>0;i--){
			for(j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 15:");
		i=0;
		j=0;
		k=0;
		for(i=1;i<=5;i++){
			for(j=5;j>=i;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 16:");
		i=0;
		j=0;
		k=0;
		for(i=1;i<=5;i++){
			for(j=5;j>5-i;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 17:");
		i=0;
		j=0;
		k=0;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				k=k+1;
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 18:");
		i=0;
		j=0;
		for(i=5;i>0;i--){
			for(j=1;j<=i;j++){
				System.out.print((char)(ascii+j)+" ");
			}
			System.out.println();
		}
	}
}