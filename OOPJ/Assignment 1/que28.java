/*
Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal string(Note: Here you can use doubleToDoubleBits() method adouble with
 methods of Double class).
*/

class que28{
    public static void main(String args[]){
        double double1=12.3456789;
        String str=Double.toString(double1);
        System.out.println("Double value into String:"+str);
        Double double2=new Double(double1);
        System.out.println("Double value into Double instance:"+double2);
        String str1=new String("12.3456");
        double double3=Double.parseDouble(str1);
        System.out.println("String instance into Double instance:"+double3);
        System.out.println("Double value into Binary String:"+Long.toBinaryString(Double.doubleToLongBits(double1)));
        System.out.println("Double value into Hex String:"+Double.toHexString(double1));
        System.out.println("Double value into Octal String:"+Long.toOctalString(Double.doubleToLongBits(double1)));

    }
}

/*
Double value into String:12.3456789
Double value into Double instance:12.3456789
String instance into Double instance:12.3456
Double value into Binary String:100000000101000101100001111110011010011001001001101010110100010
Double value into Hex String:0x1.8b0fcd324d5a2p3
Double value into Octal String:400505417632311152642
*/