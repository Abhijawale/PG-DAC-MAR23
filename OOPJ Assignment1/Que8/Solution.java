class Solution{
    public static void main(String args[]){
        //byte value into String
        byte a = 127;   //Range -128 to 127
        String s1 = Byte.toString(a);
        System.out.println("byte value into String :"+s1);

        //byte value into Byte instance.
        byte b = 96;
        Byte b1 = new Byte(b);
        System.out.println("byte value into Byte instance :"+b1);

        //String instance into Byte instance.
        String s2 = new String("12");
        Byte bi = Byte.parseByte(s2);
        System.out.println("String instance into Byte instance: "+bi);


    }
}    

// javac Solution.java

// java Solution
// byte value into String :127
// byte value into Byte instance :96
// String instance into Byte instance: 12
