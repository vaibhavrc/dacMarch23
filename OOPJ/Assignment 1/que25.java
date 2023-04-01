/*
Write a program to convert state of Integer instance into byte, short, int, long, float and double.
*/
class que25{
    public static void main(String args[]){
        Float b1=new Float("123.456F");
        System.out.println("Convert into Byte: "+b1.byteValue());
        System.out.println("Convert into Short: "+b1.shortValue());
        System.out.println("Convert into Int: "+b1.intValue());
        System.out.println("Convert into Long: "+b1.longValue());
        System.out.println("Convert into Float: "+((float)b1));
        System.out.println("Convert into Double: "+((double)b1));
    }
}

/*
Convert into Byte: 123
Convert into Short: 123
Convert into Int: 123
Convert into Long: 123
Convert into Float: 123.456
Convert into Double: 123.45600128173828
*/