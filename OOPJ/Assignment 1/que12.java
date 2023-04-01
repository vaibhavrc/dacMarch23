/*
Write a program to perform below operations on short type to get: 
a. The number of bits used to represent a short value 
b. The number of bytes used to represent a short value 
c. The minimum value a short 
d. The maximum value a short
*/

class que12{
    public static void main(String args[]){
        System.out.println("Bytes: "+Short.BYTES);
        System.out.println("Max Value: "+Short.MAX_VALUE);
        System.out.println("Min Value: "+Short.MIN_VALUE);
        System.out.println("Size: "+Short.SIZE);
    }
}

/*
Bytes: 2
Max Value: 32767
Min Value: -32768
Size: 16
*/