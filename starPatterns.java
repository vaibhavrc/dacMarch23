class starPatterns{
	public static void main(String args[]){
		int i,j,k=0;
		System.out.println("Pattern 1:");
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Pattern 2:");
		i=0;
		j=0;
		k=0;
		for(i=1;i<=5;i++){
			for(k=1;k<=5-i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Pattern 3:");
		i=0;
		j=0;
		for(i=1;i<=5;i++){
			for(j=5;j>=i;j--){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Pattern 4:");
		i=0;
		j=0;
		k=0;
		for(i=1;i<=5;i++){
			for(k=1;k<i;k++){
				System.out.print(" ");
			}
			for(j=5;j>=i;j--){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Pattern 5:");
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
		System.out.println("Pattern 6:");
		i=0;
		j=0;
		k=0;
		for(i=5;i>0;i--){
			for(k=1;k<=5-i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 7:");
		i=0;
		j=0;
		k=0;
		for(i=0;i<5;i++){
			for(k=1;k<5-i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=i*2+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=4;i>0;i--){
			for(k=1;k<=5-i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=i*2-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 8:");
		i=0;
		j=0;
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(i=1;i<5;i++){
			for(j=4;j>=i;j--){
				System.out.print("*");
			}
			System.out.println("");
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
				System.out.print("*");
			}
			System.out.println("");
		}
		for(i=1;i<=4;i++){
			for(k=1;k<=i;k++){
				System.out.print(" ");
			}
			for(j=4;j>=i;j--){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
		System.out.println("Pattern 10:");
		i=0;
		j=0;
		k=0;
		for(i=1;i<=5;i++){
			for(k=1;k<=5-i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
		System.out.println("Pattern 11:");
		i=0;
		j=0;
		k=0;
		for(i=1;i<=5;i++){
			for(k=1;k<i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=5;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println();
		System.out.println("Pattern 12:");
		i=0;
		j=0;
		for(i=1;i<=5;i++){
			for(j=5;j>=i;j--){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(i=2;i<=5;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Pattern 13:");
		i=0;
		j=0;
		k=0;
		for(i=1;i<=5;i++){
			for(k=1;k<i;k++){
				System.out.print(" ");
			}
			for(j=5;j>=i;j--){
				System.out.print("*");
			}
			System.out.println("");
		}
		for(i=2;i<=5;i++){
			for(k=1;k<=5-i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Pattern 14:");
		i=0;
		j=0;
		k=0;
		for(i=1;i<=5;i++){
			for(k=1;k<i;k++){
				System.out.print(" ");
			}
			for(j=5;j>=i;j--){
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(i=2;i<=5;i++){
			for(k=1;k<=5-i;k++){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Pattern 15:");
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				if(i==1||i==5||j==1||i==j){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Pattern 16:");
		for(i=1;i<=5;i++){
			for(k=4;k>=i;k--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				if(i==1||i==5||j==1||i==j){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}