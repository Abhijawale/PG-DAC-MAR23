class DoubleInst {
    public static void main(String[] args) {
        Double num = 3.14159; // Replace with your Double instance
        
        byte b = num.byteValue();
        short s = num.shortValue();
        int i = num.intValue();
        long l = num.longValue();
        float f = num.floatValue();
        double d = num.doubleValue();
        
        System.out.println("Original Double value: " + num);
        System.out.println("Converted byte value: " + b);
        System.out.println("Converted short value: " + s);
        System.out.println("Converted int value: " + i);
        System.out.println("Converted long value: " + l);
        System.out.println("Converted float value: " + f);
        System.out.println("Converted double value: " + d);
    }
}

// javac DoubleInst.java 

// java DoubleInst
// Original Double value: 3.14159
// Converted byte value: 3
// Converted short value: 3
// Converted int value: 3
// Converted long value: 3
// Converted float value: 3.14159
// Converted double value: 3.14159
