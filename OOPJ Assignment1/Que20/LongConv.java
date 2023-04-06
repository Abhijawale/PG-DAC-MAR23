class LongConv {
    public static void main(String[] args) {
        // Convert long value to String
        long num1 = 12961295L;
        String str1 = Long.toString(num1);
        System.out.println("Long to String: " + str1);

        // Convert long value to Long instance
        long num2 = 12941293L;
        Long longObj = Long.valueOf(num2);
        System.out.println("Long to Long instance: " + longObj);

        // Convert String instance to Long instance
        String str2 = "12921291";
        Long longObj2 = Long.valueOf(str2);
        System.out.println("String to Long instance: " + longObj2);

        // Convert long value to binary, octal, and hexadecimal string
        long num3 = 12921292L;
        String binaryStr = Long.toBinaryString(num3);
        String octalStr = Long.toOctalString(num3);
        String hexStr = Long.toHexString(num3);
        
        System.out.println("Binary String: " + binaryStr);
        System.out.println("Octal String: " + octalStr);
        System.out.println("Hexadecimal String: " + hexStr);
    }
}

// javac LongConv.java

// java LongConv
// Long to String: 12961295
// Long to Long instance: 12941293
// String to Long instance: 12921291
// Binary String: 110001010010100111001100
// Octal String: 61224714
// Hexadecimal String: c529cc
