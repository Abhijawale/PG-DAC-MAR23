class LongValue {
    public static void main(String[] args) {
        
        // a. The number of bits used to represent a long value
        int numBits = Long.SIZE;
        System.out.println("Number of bits used to represent a long value: " + numBits);

        // b. The number of bytes used to represent a long value
        int numBytes = Long.BYTES;
        System.out.println("Number of bytes used to represent a long value: " + numBytes);

        // c. The minimum value a long
        long minValue = Long.MIN_VALUE;
        System.out.println("Minimum value of a long: " + minValue);

        // d. The maximum value a long
        long maxValue = Long.MAX_VALUE;
        System.out.println("Maximum value of a long: " + maxValue);
    }
}

// javac LongValue.java 

// java LongValue
// Number of bits used to represent a long value: 64
// Number of bytes used to represent a long value: 8
// Minimum value of a long: -9223372036854775808
// Maximum value of a long: 9223372036854775807

