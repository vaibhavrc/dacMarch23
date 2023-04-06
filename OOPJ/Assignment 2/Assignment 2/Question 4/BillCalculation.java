class ElectricityBill {
    private String customerName;
    private double unitsConsumed;
    private double billAmount;
    ElectricityBill(){
        this(null,0);
    } 
    ElectricityBill(String customerName,double unitsConsumed){
        this.customerName=customerName;
        this.unitsConsumed=unitsConsumed;
    }
    public void calculateBill(){
        if (this.unitsConsumed<=100){
            this.billAmount=this.unitsConsumed*5;
        }
        else if (this.unitsConsumed<=200){
            this.billAmount=((this.unitsConsumed-100)*7+(100*5));
        }
        else {
            this.billAmount=((this.unitsConsumed-200)*10+(100*7)+(100*5));
        }
        System.out.println("Bill Amount for "+this.customerName+" is:"+this.billAmount);
    }
}
class BillCalculation{
    public static void main(String[] args) {
        ElectricityBill bill1=new ElectricityBill("Customer 1",123.5);
        bill1.calculateBill();
        ElectricityBill bill2=new ElectricityBill("customer 2",257.3);
        bill2.calculateBill();
    }

}
