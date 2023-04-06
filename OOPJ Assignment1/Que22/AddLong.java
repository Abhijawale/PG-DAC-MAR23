public class AddLong {

    public static void main(String[] args) {
        long[] numbers = { 10L, 20L, 30L, 40L, 50L };
        
        long min = Long.min(numbers[0], Long.min(numbers[1], Long.min(numbers[2], Long.min(numbers[3], numbers[4]))));
        long max = Long.max(numbers[0], Long.max(numbers[1], Long.max(numbers[2], Long.max(numbers[3], numbers[4]))));
        long sum = Long.sum(100L, 200L);
        
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
        System.out.println("Sum of two numbers: " + sum);
    }

}

// javac AddLong.java

// java AddLong
// Minimum number: 10
// Maximum number: 50
// Sum of two numbers: 300