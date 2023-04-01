/*
Write a program to find minimum and maximum number as well as to add two float numbers using methods of Float.
*/

class que26{
    public static void main(String args[]){
        float a=102.03040F;
        float b=2030.405060F;
        System.out.println("Max. of two numbers is: "+Float.max(a,b));
        System.out.println("Min. of two numbers is: "+Float.min(a,b));
        System.out.println("Sum of two numbers is: "+Float.sum(a,b));
    }
}
/*
Max. of two numbers is: 2030.405
Min. of two numbers is: 102.0304
Sum of two numbers is: 2132.4355
*/