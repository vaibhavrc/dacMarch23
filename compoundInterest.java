/*amount=50000000
investment=115600000
no. of years=5
roi=10.75
*/
class compoundInterest{
	public static void main(String args[]){
		int amount=50000000;
		int investment=115600000;
		int tenure=5;
		float roi=10.75f;
		float CI=amount*((1+(roi/100))*(1+(roi/100))*(1+(roi/100))*(1+(roi/100))*(1+(roi/100)))-amount;
		System.out.println("CI is:"+CI);
	}
}