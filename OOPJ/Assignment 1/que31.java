/*
Read the documentation of NumberFormatException and try to generate it in Java code.

public class NumberFormatException
extends IllegalArgumentException
Thrown to indicate that the application has attempted to convert a string to one of the numeric types, but that the 
string does not have the appropriate format.
*/

class que31{
    public static void main(String args[]){
        String str="12A34";
        int int1=Integer.parseInt(str);
        System.out.println("Integer value is:"+int1);
    }
}
/*
Exception in thread "main" java.lang.NumberFormatException: For input string: "12A34"
        at java.lang.NumberFormatException.forInputString(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at java.lang.Integer.parseInt(Unknown Source)
        at que31.main(que31.java:7)
*/
