/*
Write a program to convert:
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.
*/
class que8{
    public static void main(String args[]){
        byte byte1=12;
        String str=Byte.toString(byte1);
        System.out.println("byte value into String:"+str);
        Byte byte2=new Byte(byte1);
        System.out.println("byte value into Byte instance:"+byte2);
        String str1=new String("123");
        byte byte3=Byte.parseByte(str1);
        System.out.println("String instance into Byte instance:"+byte3);
    }
}

/*
byte value into String:12
byte value into Byte instance:12
String instance into Byte instance:123
*/