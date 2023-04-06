class Solution{
    public static void main(String args[]){
        //Byte instance into byte
        byte b = 12;
        Byte bi = new Byte(b);

        byte b1 = bi.byteValue();
        System.out.println("Byte instance into byte :"+b1);

        //Byte instance into short
        short s = bi.shortValue();
        System.out.println("Byte instance into short :"+s);
        
        //Byte instance into int
        int i = bi.intValue();
        System.out.println("Byte instance into int :"+i);

        //Byte instance into float
        float f = bi.floatValue();
        System.out.println("Byte instance into float :"+f);

        //Byte instance into long
        long l = bi.longValue();
        System.out.println("Byte instance into long :"+l);

        //Byte instance into double
        double d = bi.doubleValue();
        System.out.println("Byte instance into double :"+d);

    }
}
// javac Solution.java

// java Solution
// Byte instance into byte :12
// Byte instance into short :12
// Byte instance into int :12
// Byte instance into float :12.0
// Byte instance into long :12
// Byte instance into double :12.0