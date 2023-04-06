class AddDouble {
    public static void main(String[] args) {
        double num1 = 3.14;
        double num2 = 6.28;

        double min = Double.min(num1, num2);
        double max = Double.max(num1, num2);
        double sum = Double.sum(num1, num2);

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum: " + sum);
    }
}

// javac AddDouble.java

// java AddDouble
// Minimum: 3.14
// Maximum: 6.28
// Sum: 9.42