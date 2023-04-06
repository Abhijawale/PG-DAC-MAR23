class Solution{
    public static void main(String[] args) {
        //The number of bits used to represent a byte value
        byte a = Byte.SIZE;
        System.out.println("The number of bits used to represent a byte value: "+a);

        //The number of bytes used to represent a byte value
        byte b = Byte.BYTES;
        System.out.println("The number of bytes used to represent a byte value: "+b);

        //The minimum value a byte
        byte c = Byte.MIN_VALUE;
        System.out.println("The minimum value a byte: "+c);

        //The maximum value a byte
        byte d = Byte.MAX_VALUE;
        System.out.println("The maximum value a byte: "+d);

    }
}


// javac Solution.java

// java Solution
// The number of bits used to represent a byte value: 8
// The number of bytes used to represent a byte value: 1
// The minimum value a byte: -128
// The maximum value a byte: 127