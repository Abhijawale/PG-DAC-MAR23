class Solution {
    public static void main (String args[]) {
        // Convert short to String
        short num = 100;
        String strNum = String.valueOf(num);
        //String strNum2 = Short.toString(num); 
        System.out.println("String representation of short: " + strNum); // Output: String representation of short: 100
        
        // Convert short to Short
        Short shortObj = Short.valueOf(num); 
       // Short shortObj2 = new Short(num); 
        System.out.println("Short instance from short: " + shortObj); 
        
        // Convert String to Short
        String strNum3 = "200";
        Short shortObj3 = Short.valueOf(strNum3); 
        //Short shortObj4 = new Short(strNum3); 
        System.out.println("Short instance from String: " + shortObj3); 
    }
}
// javac Solution.java

// java Solution
// String representation of short: 100
// Short instance from short: 100
// Short instance from String: 200