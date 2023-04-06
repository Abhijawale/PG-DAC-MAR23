import java.util.Scanner;

class BMICalculator {
    private double height;
    private double weight;
    
    public BMICalculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    
    // Getter methods
    public double getHeight() {
        return height;
    }
    
    public double getWeight() {
        return weight;
    }
    
    // Setter methods
    public void setHeight(double height) {
        this.height = height;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    // Calculate BMI
    public double calculateBMI() {
        double BMI = weight / (height * height);
        return BMI;
    }
    // Method to print BMI
    public void printBMI() {
        //double bmi = calculateBMI();
        System.out.printf("Your BMI is %.2f\n", calculateBMI());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt user to enter height and weight
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();
        
        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();
        
        // Create BMI calculator object and set height and weight fields
        BMICalculator bmiCal = new BMICalculator(height, weight);

        // Call printBMI method to print BMI
        bmiCal.printBMI();
             
        sc.close();
    }
}

// javac BMICalculator.java

// java BMICalculator      
// Enter your height in meters: 1.64
// Enter your weight in kilograms: 53.5
// Your BMI is 19.89