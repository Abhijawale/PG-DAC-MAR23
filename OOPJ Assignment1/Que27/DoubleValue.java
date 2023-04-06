class DoubleValue {
    public static void main(String[] args) {
        
        int numBits = Double.SIZE;
        System.out.println("Number of bits used to represent a double value: " + numBits);

        int numBytes = Double.BYTES;
        System.out.println("Number of bytes used to represent a double value: " + numBytes);

        double minVal = Double.MIN_VALUE;
        System.out.println("Minimum value a double can have: " + minVal);

        double maxVal = Double.MAX_VALUE;
        System.out.println("Maximum value a double can have: " + maxVal);
    }
}

// javac DoubleValue.java

// java DoubleValue
// Number of bits used to represent a double value: 64
// Number of bytes used to represent a double value: 8
// Minimum value a double can have: 4.9E-324
// Maximum value a double can have: 1.7976931348623157E308
