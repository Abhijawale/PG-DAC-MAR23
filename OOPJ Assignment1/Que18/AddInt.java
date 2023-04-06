import java.util.Arrays;

class AddInt {   
    public static void main(String[] args) {
        Integer[] nums = {7, 2, 5, 1, 10};
        
        // Find the minimum number
        Integer min = Arrays.stream(nums).min(Integer::compare).get();
        System.out.println("Minimum number: " + min);
        
        // Find the maximum number
        Integer max = Arrays.stream(nums).max(Integer::compare).get();
        System.out.println("Maximum number: " + max);
        
        // Add two integers
        Integer a = 5;
        Integer b = 10;
        Integer sum = Integer.sum(a, b);
        System.out.println("Sum of " + a + " and " + b + " is " + sum);
    }
}

// javac AddInt.java

// java AddInt
// Minimum number: 1
// Maximum number: 10
// Sum of 5 and 10 is 15
