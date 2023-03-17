class evenNumber{
	public static void main(String args[]){
		int number=Integer.parseInt(args[0]);
		String state=(number%2==0)?"even":"odd";
		System.out.println("Number "+number+" is "+state);
	}
}