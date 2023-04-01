/*
Write a program to perform below operations on int type to get: 
a. The number of bits used to represent a integer value 
b. The number of bytes used to represent a integer value 
c. The minimum value a integer 
d. The maximum value a integer
*/
class que15{
    public static void main(String args[]){
        System.out.println("Bytes: "+Integer.BYTES);
        System.out.println("Max Value: "+Integer.MAX_VALUE);
        System.out.println("Min Value: "+Integer.MIN_VALUE);
        System.out.println("Size: "+Integer.SIZE);
    }
}

/*
Bytes: 4
Max Value: 2147483647
Min Value: -2147483648
Size: 32
*/