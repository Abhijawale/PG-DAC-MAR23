class IntConv {
    public static void main(String[] args) {
       
        int numBits = Integer.SIZE;
        System.out.println("Number of bits used to represent int: " + numBits);

        int numBytes = Integer.BYTES;
        System.out.println("Number of bytes used to represent int: " + numBytes);

        int minValue = Integer.MIN_VALUE;
        System.out.println("Minimum value of an integer: " + minValue);

        int maxValue = Integer.MAX_VALUE;
        System.out.println("Maximum value of an integer: " + maxValue);
    }
}

// javac IntConv.java

// >java IntConv       
// Number of bits used to represent int: 32
// Number of bytes used to represent int: 4
// Minimum value of an integer: -2147483648
// Maximum value of an integer: 2147483647

