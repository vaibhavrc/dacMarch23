/*
Write a program to convert state of Integer instance into byte, short, int, long, float and double.
*/
class que21{
    public static void main(String args[]){
        Long b1=new Long("1234567890");
        System.out.println("Convert into Byte: "+b1.byteValue());
        System.out.println("Convert into Short: "+b1.shortValue());
        System.out.println("Convert into Int: "+b1.intValue());
        System.out.println("Convert into Long: "+((long)b1));
        System.out.println("Convert into Float: "+((float)b1));
        System.out.println("Convert into Double: "+((double)b1));
    }
}

/*
Convert into Byte: -46
Convert into Short: 722
Convert into Int: 1234567890
Convert into Long: 1234567890
Convert into Float: 1.23456794E9
Convert into Double: 1.23456789E9
*/