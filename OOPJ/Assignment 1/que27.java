/*
Write a program to perform below operations on Double type to get: 
a. The number of bits used to represent a double value 
b. The number of bytes used to represent a double value 
c. The minimum value a double 
d. The maximum value a double
*/
class que27{
    public static void main(String args[]){
        System.out.println("Bytes: "+Double.BYTES);
        System.out.println("Max Value: "+Double.MAX_VALUE);
        System.out.println("Min Value: "+Double.MIN_VALUE);
        System.out.println("Size: "+Double.SIZE);
    }
}

/*
Bytes: 8
Max Value: 1.7976931348623157E308
Min Value: 4.9E-324
Size: 64
*/