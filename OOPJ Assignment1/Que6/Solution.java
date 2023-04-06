class Solution{
    public static void main(String args[]){
        //boolean value into string...
        boolean b1 = true;
        boolean b2 = false;
        String s1 = String.valueOf(b1);
        String s2 = String.valueOf(b2);
        System.out.println("boolean to string : "+s1);
        System.out.println("boolean to string : "+s2);
        System.out.println("---------------------------1");

       // boolean value into Boolean instance...
        boolean b3 = new Boolean(b1);
        Boolean b4 = Boolean.valueOf(b2);
        System.out.println("Boolean instance : "+b3);
        System.out.println("Boolean instance : "+b4);
        System.out.println("---------------------------2");

        //String value into boolean value...
        String s3 = "true";
        String s4 = "false";
        boolean b5 = Boolean.valueOf(s3);
        boolean b6 = Boolean.valueOf(s4);
        System.out.println("String to boolean : "+b5);
        System.out.println("String to boolean : "+b6);
        System.out.println("---------------------------3");

        //String value into boolean instance...
        String s5 = "true";
        String s6 = "false";
        boolean b7 = Boolean.valueOf(s5);
        boolean b8 = Boolean.valueOf(s6);
        Boolean b9 = Boolean.valueOf(b7);
        Boolean b10 = Boolean.valueOf(b8);
        System.out.println("String to boolean : "+b9);
        System.out.println("String to boolean : "+b10);
        System.out.println("---------------------------4");

    }
}


// javac Solution.java
// java Solution
// boolean to string : true
// boolean to string : false
// ---------------------------1
// Boolean instance : true
// Boolean instance : false
// ---------------------------2
// String to boolean : true
// String to boolean : false
// ---------------------------3
// String to boolean : true
// String to boolean : false
// ---------------------------4