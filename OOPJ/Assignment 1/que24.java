/*
Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string.
*/

class que24{
    public static void main(String args[]){
        float float1=123.456f;
        String str=Float.toString(float1);
        System.out.println("Float value into String:"+str);
        Float float2=new Float(float1);
        System.out.println("Float value into Float instance:"+float2);
        String str1=new String("123.456f");
        Float float3=Float.parseFloat(str1);
        System.out.println("String instance into Float instance:"+float3);
        System.out.println("Float value into Hex String:"+Float.toHexString(float1));
    }
}

/*
Float value into String:123.456
Float value into Float instance:123.456
String instance into Float instance:123.456
Float value into Hex String:0x1.edd2f2p6
*/