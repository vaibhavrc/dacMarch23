/*
Write a program to convert state of Short instance into byte, short, int, long, float and double.
*/
class que14{
    public static void main(String args[]){
        Short b1=new Short("1234");
        System.out.println("Convert into Byte: "+b1.byteValue());
        System.out.println("Convert into Short: "+((short)b1));
        System.out.println("Convert into Int: "+((int)b1));
        System.out.println("Convert into Long: "+((long)b1));
        System.out.println("Convert into Float: "+((float)b1));
        System.out.println("Convert into Double: "+((double)b1));
    }
}

/*
Convert into Byte: -46
Convert into Short: 1234
Convert into Int: 1234
Convert into Long: 1234
Convert into Float: 1234.0
Convert into Double: 1234.0
*/