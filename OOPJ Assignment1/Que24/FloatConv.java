class FloatConv {
    public static void main(String[] args) {
        // Convert float value to String
        float f = 3.14f;
        String str = Float.toString(f);
        System.out.println("Float value to String: " + str);

        // Convert float value to Float instance
        Float floatObj = Float.valueOf(f);
        System.out.println("Float value to Float instance: " + floatObj);

        // Convert String instance to Float instance
        String str2 = "3.14";
        Float floatObj2 = Float.valueOf(str2);
        System.out.println("String instance to Float instance: " + floatObj2);

        // Convert float value to hexadecimal string
        String hexStr = Float.toHexString(f);
        System.out.println("Float value to hexadecimal string: " + hexStr);
    }
}

// javac FloatConv.java

// java FloatConv
// Float value to String: 3.14
// Float value to Float instance: 3.14
// String instance to Float instance: 3.14
// Float value to hexadecimal string: 0x1.91eb86p1
