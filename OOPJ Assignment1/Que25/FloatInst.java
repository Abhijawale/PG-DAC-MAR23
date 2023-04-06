class FloatInst {
    public static void main(String[] args) {
        Float FV = 123.45f;

        // Convert to byte
        byte byteValue = FV.byteValue();
        System.out.println("Float value as byte: " + byteValue);

        // Convert to short
        short shortValue = FV.shortValue();
        System.out.println("Float value as short: " + shortValue);

        // Convert to int
        int intValue = FV.intValue();
        System.out.println("Float value as int: " + intValue);

        // Convert to long
        long longValue = FV.longValue();
        System.out.println("Float value as long: " + longValue);

        // Convert to float (no conversion necessary)
        float floatValue2 = FV.floatValue();
        System.out.println("Float value as float: " + floatValue2);

        // Convert to double (no conversion necessary)
        double doubleValue = FV.doubleValue();
        System.out.println("Float value as double: " + doubleValue);
    }
}

//javac FloatInst.java

// java FloatInst
// Float value as byte: 123
// Float value as short: 123
// Float value as int: 123
// Float value as long: 123
// Float value as float: 123.45
// Float value as double: 123.44999694824219