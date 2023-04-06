public class ShortInst {

    public static void main(String[] args) {
        Short value = 12;

        // Convert to byte
        byte byteValue = value.byteValue();
        System.out.println("Byte value: " + byteValue);

        // Convert to short
        short shortValue = value.shortValue();
        System.out.println("Short value: " + shortValue);

        // Convert to int
        int intValue = value.intValue();
        System.out.println("Int value: " + intValue);

        // Convert to long
        long longValue = value.longValue();
        System.out.println("Long value: " + longValue);

        // Convert to float
        float floatValue = value.floatValue();
        System.out.println("Float value: " + floatValue);

        // Convert to double
        double doubleValue = value.doubleValue();
        System.out.println("Double value: " + doubleValue);
    }
}

// javac ShortInst.java 

// >java ShortInst
// Byte value: 12
// Short value: 12
// Int value: 12
// Long value: 12
// Float value: 12.0
// Double value: 12.0