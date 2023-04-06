import java.util.Scanner;

public class RationalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the first rational number
        System.out.println("Enter the first rational number:");
        System.out.print("Numerator: ");
        int num1 = sc.nextInt();
        System.out.print("Denominator: ");
        int den1 = sc.nextInt();

        // Input the second rational number
        System.out.println("Enter the second rational number:");
        System.out.print("Numerator: ");
        int num2 = sc.nextInt();
        System.out.print("Denominator: ");
        int den2 = sc.nextInt();

        // Input the arithmetic operation
        System.out.println("Enter the arithmetic operation (+, -, *, /)");
        char operator = sc.next().charAt(0);
        sc.close();

        // Perform the arithmetic operation on the rational numbers
        int resultNum = 0, resultDen = 0;
        switch (operator) {
            case '+':
                resultNum = num1 * den2 + num2 * den1;
                resultDen = den1 * den2;
                break;
            case '-':
                resultNum = num1 * den2 - num2 * den1;
                resultDen = den1 * den2;
                break;
            case '*':
                resultNum = num1 * num2;
                resultDen = den1 * den2;
                break;
            case '/':
                resultNum = num1 * den2;
                resultDen = den1 * num2;
                break;
            default:
                System.out.println("Invalid operator!");
                System.exit(0);
        }

        // Reduce the result to its lowest terms
        int gcd = findGCD(resultNum, resultDen);
        resultNum /= gcd;
        resultDen /= gcd;

        // Output the result
        System.out.println("Result: " + resultNum + "/" + resultDen);
    }

    // Helper method to find the greatest common divisor of two numbers
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}

// javac RationalNum.java 

// java RationalNum      
// Enter the first rational number:
// Numerator: 96
// Denominator: 94
// Enter the second rational number:
// Numerator: 86
// Denominator: 84
// Enter the arithmetic operation (+, -, *, /)
// *
// Result: 344/329
