/*
6.Write a program to perform below operations on Boolean type to convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.
*/

class que6{
    public static void main(String args[]){
        boolean bool=false;
        String str=Boolean.toString(bool);
        System.out.println("boolean value into String:"+str);
        Boolean bool1=new Boolean(false);
        System.out.println("boolean value into Boolean instance:"+bool1);
        boolean bool2=Boolean.parseBoolean(str);
        System.out.println("String value into boolean value:"+bool2);
        Boolean bool3=new Boolean(str);
        System.out.println("String value into Boolean instance:"+bool3);
    }
}
/*
boolean value into String:false
boolean value into Boolean instance:false
String value into boolean value:false
String value into Boolean instance:false
*/