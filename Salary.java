/*basic=10000.8989009
TA=5600.6778
DA 14% of basic
Petrol allowance=7000.3443534546
Tax deduction=1.76% of DA */
class Salary{
	public static void main(String args[]){
	double basic=10000.8989009;
	double TA= 5600.6778;
	double DA= 0.14*basic;
	double petrol_allowance=7000.3443534546;
	double tax_deduction=0.0176*DA;
	double salary=basic+TA+DA+petrol_allowance-tax_deduction;
	System.out.println("Gross Salary is:"+salary); 
	}
}