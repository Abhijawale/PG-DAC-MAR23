class LongInst {
    public static void main(String[] args) {
        Long LV = 12961295L;
        
        // Convert Long to byte
        byte byteValue = LV.byteValue();
        System.out.println("Byte value: " + byteValue);

        // Convert Long to short
        short shortValue = LV.shortValue();
        System.out.println("Short value: " + shortValue);

        // Convert Long to int
        int intValue = LV.intValue();
        System.out.println("Int value: " + intValue);

        // Convert Long to long
        long longPrimitiveValue = LV.longValue();
        System.out.println("Long value: " + longPrimitiveValue);

        // Convert Long to float
        float floatValue = LV.floatValue();
        System.out.println("Float value: " + floatValue);

        // Convert Long to double
        double doubleValue = LV.doubleValue();
        System.out.println("Double value: " + doubleValue);
    }
}

// javac LongInst.java

// java LongInst
// Byte value: 15
// Short value: -14833
// Int value: 12961295
// Long value: 12961295
// Float value: 1.2961295E7
// Double value: 1.2961295E7