class IntValue {
    public static void main(String[] args) {
        
        // Conversion of int value to String
        int intValue = 96;
        String stringValue = String.valueOf(intValue);
        System.out.println("Int value as a String: " + stringValue);
        
        // Conversion of int value to Integer instance
        Integer integerValue = Integer.valueOf(intValue);
        System.out.println("Int value as Integer instance: " + integerValue);
        
        // Conversion of String instance to Integer instance
        String strValue = "97";
        Integer integerValueFromString = Integer.valueOf(strValue);
        System.out.println("String value as Integer instance: " + integerValueFromString);
        
        // Conversion of int value to binary, octal and hexadecimal string
        int value = 98;
        String binaryString = Integer.toBinaryString(value);
        String octalString = Integer.toOctalString(value);
        String hexadecimalString = Integer.toHexString(value);

        System.out.println("Int value as binary string: " + binaryString);
        System.out.println("Int value as octal string: " + octalString);
        System.out.println("Int value as hexadecimal string: " + hexadecimalString);
    }
}

// javac IntValue.java

// java IntValue
// Int value as a String: 96
// Int value as Integer instance: 96
// String value as Integer instance: 97
// Int value as binary string: 1100010
// Int value as octal string: 142
// Int value as hexadecimal string: 62