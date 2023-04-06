class AddFloat {

    public static void main(String[] args) {
        
        float a = 1.5f;
        float b = 2.5f;
        
        float min = Float.min(a, b);
        System.out.println("Minimum number: " + min);
        
        float max = Float.max(a, b);
        System.out.println("Maximum number: " + max);
        
        float sum = Float.sum(a, b);
        System.out.println("Sum of two numbers: " + sum);
    }

}

// javac AddFloat.java

// java AddFloat
// Minimum number: 1.5
// Maximum number: 2.5
// Sum of two numbers: 4.0
