class Solution {
    public static void main(String[] args) {

        // Get the number of bits used to represent a short value
        short numBits = Short.SIZE;
        System.out.println("Number of bits used to represent a short value: " + numBits);

        // Get the number of bytes used to represent a short value
        short numBytes = Short.BYTES;
        System.out.println("Number of bytes used to represent a short value: " + numBytes);

        // Get the minimum value a short can have
        short minValue = Short.MIN_VALUE;
        System.out.println("Minimum value a short can have: " + minValue);

        // Get the maximum value a short can have
        short maxValue = Short.MAX_VALUE;
        System.out.println("Maximum value a short can have: " + maxValue);
    }
}
// javac Solution.java

// java Solution
// Number of bits used to represent a short value: 16
// Number of bytes used to represent a short value: 2
// Minimum value a short can have: -32768
// Maximum value a short can have: 32767