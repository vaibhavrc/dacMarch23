/*
Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
*/

class que16{
    public static void main(String args[]){
        int int1=12;
        String str=Integer.toString(int1);
        System.out.println("Integer value into String:"+str);
        Integer int2=new Integer(int1);
        System.out.println("Integer value into Integer instance:"+int2);
        String str1=new String("123");
        int int3=Integer.parseInt(str1);
        System.out.println("String instance into Integer instance:"+int3);
    }
}

/*
Integer value into String:12
Integer value into Integer instance:12
String instance into Integer instance:123
*/
