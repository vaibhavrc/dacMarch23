/*
Write a program to perform below operations on long type to get: 
a. The number of bits used to represent a long value 
b. The number of bytes used to represent a long value 
c. The minimum value a long 
d. The maximum value a long
*/
class que19{
    public static void main(String args[]){
        System.out.println("Bytes: "+Long.BYTES);
        System.out.println("Max Value: "+Long.MAX_VALUE);
        System.out.println("Min Value: "+Long.MIN_VALUE);
        System.out.println("Size: "+Long.SIZE);
    }
}

/*
Bytes: 8
Max Value: 9223372036854775807
Min Value: -9223372036854775808
Size: 64
*/