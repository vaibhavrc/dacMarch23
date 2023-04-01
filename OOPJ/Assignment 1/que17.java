/*
Write a program to convert state of Integer instance into byte, short, int, long, float and double.
*/
class que17{
    public static void main(String args[]){
        Integer b1=new Integer("1234567");
        System.out.println("Convert into Byte: "+b1.byteValue());
        System.out.println("Convert into Short: "+b1.shortValue());
        System.out.println("Convert into Int: "+((int)b1));
        System.out.println("Convert into Long: "+((long)b1));
        System.out.println("Convert into Float: "+((float)b1));
        System.out.println("Convert into Double: "+((double)b1));
    }
}

/*
Convert into Byte: -121
Convert into Short: -10617
Convert into Int: 1234567
Convert into Long: 1234567
Convert into Float: 1234567.0
Convert into Double: 1234567.0
*/