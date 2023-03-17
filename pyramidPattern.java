class pyramidPattern{
	public static void main(String args[]){
		int i,j,k=0;
		System.out.println("Pattern 1:");
		for(i=1;i<=9;i++){
			for(k=9;k>i;k--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 2:");
		for(i=1;i<=9;i++){
			for(k=9;k>i;k--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 3:");
		for(i=1;i<=9;i++){
			for(k=9;k>i;k--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 4:");
		for(i=1;i<=9;i++){
			for(k=9;k>i;k--){
				System.out.print("  ");
			}
			for(j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			for(int l=i-1;l>0;l--){
				System.out.print(l+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 5:");
		for(i=9;i>0;i--){
			for(k=i-1;k>0;k--){
				System.out.print("  ");
			}
			for(j=i;j<=9;j++){
				System.out.print(j+" ");
			}
			for(int l=8;l>i-1;l--){
				System.out.print(l+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 6:");
		for(i=0;i<9;i++){
			for(k=i;k>0;k--){
				System.out.print(" ");
			}
			for(j=9;j>i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Pattern 7:");
		for(i=0;i<9;i++){
			for(k=i;k>0;k--){
				System.out.print(" ");
			}
			for(j=9;j>i;j--){
				System.out.print((9-i)+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Half Pyramid:");
		for(i=1;i<=6;i++){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Inverted Half Pyramid:");
		for(i=1;i<=6;i++){
			for(j=6;j>=i;j--){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Inverted Half Pyramid:");
		for(i=1;i<=6;i++){
			for(j=6;j>=i;j--){
				if(i==1||j==i||j==6){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		System.out.println();
		System.out.println("Full Pyramid:");
		for(i=1;i<=6;i++){
			for(k=6;k>i;k--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Inverted Full Pyramid:");
		for(i=0;i<6;i++){
			for(k=i;k>0;k--){
				System.out.print(" ");
			}
			for(j=6;j>i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Hollow Full Pyramid:");
		for(i=1;i<=6;i++){
			for(k=6;k>i;k--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				if(j==1||j==i||i==6){
					System.out.print("* ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}