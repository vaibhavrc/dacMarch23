/*
Write a program to convert:
a. short value into String
b. short value into Short instance.
*/

class que13{
    public static void main(String args[]){
        short short1=12;
        String str=Short.toString(short1);
        System.out.println("Short value into String:"+str);
        Short short2=new Short(short1);
        System.out.println("Short value into Short instance:"+short2);
        String str1=new String("123");
        short short3=Short.parseShort(str1);
        System.out.println("String instance into Short instance:"+short3);
    }
}

/*
Short value into String:12
Short value into Short instance:12
String instance into Short instance:123
*/
