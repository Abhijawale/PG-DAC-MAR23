public class NumberFormat {
    public static void main(String[] args) {
        String str = "abc123"; // this string contains non-numeric characters
        int num = Integer.parseInt(str); // this will throw a NumberFormatException
        System.out.println("int :"+num);
    }

}

//javac NumberFormat.java

// java NumberFormat
// Exception in thread "main" java.lang.NumberFormatException: For input string: "abc123"
//         at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
//         at java.lang.Integer.parseInt(Integer.java:580)
//         at java.lang.Integer.parseInt(Integer.java:615)
//         at NumberFormat.main(NumberFormat.java:4)


