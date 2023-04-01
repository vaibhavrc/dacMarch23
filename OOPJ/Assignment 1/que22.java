/*
Write a program to find minimum and maximum number as well as to add two long numbers using methods of Long.
*/

class que22{
    public static void main(String args[]){
        long a=10203040l;
        long b=2030405060l;
        System.out.println("Max. of two numbers is: "+Long.max(a,b));
        System.out.println("Min. of two numbers is: "+Long.min(a,b));
        System.out.println("Sum of two numbers is: "+Long.sum(a,b));
    }
}
/*
Max. of two numbers is: 2030405060
Min. of two numbers is: 10203040
Sum of two numbers is: 2040608100
*/