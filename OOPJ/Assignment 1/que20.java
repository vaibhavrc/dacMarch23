/*
Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.
*/

class que20{
    public static void main(String args[]){
        long long1=1234567l;
        String str=Long.toString(long1);
        System.out.println("Long value into String:"+str);
        Long long2=new Long(long1);
        System.out.println("Long value into Long instance:"+long2);
        String str1=new String("123456");
        long long3=Long.parseLong(str1);
        System.out.println("String instance into Long instance:"+long3);
        System.out.println("Long value into Binary String:"+Long.toBinaryString(long1));
        System.out.println("Long value into Hex String:"+Long.toHexString(long1));
        System.out.println("Long value into Octal String:"+Long.toOctalString(long1));

    }
}

/*
Long value into String:1234567
Long value into Long instance:1234567
String instance into Long instance:123456
Long value into Binary String:100101101011010000111
Long value into Hex String:12d687
Long value into Octal String:4553207
*/