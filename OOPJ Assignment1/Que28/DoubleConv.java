class DoubleConv {
    public static void main(String[] args) {
      // convert double value to string
      double num = 3.14159;
      String strNum = Double.toString(num);
      System.out.println("String: "+strNum); // prints "3.14159"
      
      // convert double value to Double instance
      Double doubleNum = new Double(num);
      System.out.println("double value to Double instance: "+doubleNum); // prints "3.14159"
      
      // convert String instance to Double instance
      String strNum2 = "2.71828";
      Double doubleNum2 = Double.parseDouble(strNum2);
      System.out.println("String instance to Double instance: "+doubleNum2); // prints "2.71828"
      
      // convert double value to binary, octal, and hexadecimal strings
      long bits = Double.doubleToLongBits(num);
      String binaryStr = Long.toBinaryString(bits);
      String octalStr = Long.toOctalString(bits);
      String hexStr = Long.toHexString(bits);
      
      System.out.println("binary: "+binaryStr); // prints "0100000000001001001000011111101101010100010001000010110100011000"
      System.out.println("octal: "+octalStr); // prints "40044324064"
      System.out.println("hexSt: "+hexStr); // prints "40c90fdb48000000"
    }
  }
  
//javac DoubleConv.java

// java DoubleConv       
// String: 3.14159
// double value to Double instance: 3.14159
// String instance to Double instance: 2.71828
// binary: 100000000001001001000011111100111110000000110111000011001101110   
// octal: 400111037476006703156
// hexSt: 400921f9f01b866e
