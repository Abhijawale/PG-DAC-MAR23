class IntInst {
    public static void main(String[] args) {
        Integer num = 1296;
        byte b = num.byteValue();
        short s = num.shortValue();
        int i = num.intValue();
        long l = num.longValue();
        float f = num.floatValue();
        double d = num.doubleValue();
        
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Integer value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
    }
}

// javac IntInst.java

// java IntInst
// Byte value: 16
// Short value: 1296
// Integer value: 1296
// Long value: 1296
// Float value: 1296.0
// Double value: 1296.0