class FloatValue {
    public static void main(String[] args) {
        // Number of bits used to represent a float value
        int floatBits = Float.SIZE;
        System.out.println("Number of bits used to represent a float value: " + floatBits);

        // Number of bytes used to represent a float value
        int floatBytes = Float.BYTES;
        System.out.println("Number of bytes used to represent a float value: " + floatBytes);

        // Minimum value a float can have
        float floatMin = Float.MIN_VALUE;
        System.out.println("Minimum value a float can have: " + floatMin);

        // Maximum value a float can have
        float floatMax = Float.MAX_VALUE;
        System.out.println("Maximum value a float can have: " + floatMax);
    }
}

// javac FloatValue.java

// java FloatValue
// Number of bits used to represent a float value: 32
// Number of bytes used to represent a float value: 4
// Minimum value a float can have: 1.4E-45
// Maximum value a float can have: 3.4028235E38

