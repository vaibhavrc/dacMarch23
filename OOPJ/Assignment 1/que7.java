/*
7.Write a program to perform below operations on byte type to get:
 a. The number of bits used to represent a byte value 
 b. The number of bytes used to represent a byte value 
 c. The minimum value a byte 
 d. The maximum value a byte
 */

class que7{
    public static void main(String args[]){
        System.out.println("Bytes: "+Byte.BYTES);
        System.out.println("Max Value: "+Byte.MAX_VALUE);
        System.out.println("Min Value: "+Byte.MIN_VALUE);
        System.out.println("Size: "+Byte.SIZE);
    }
}

/*
Bytes: 1
Max Value: 127
Min Value: -128
Size: 8
*/