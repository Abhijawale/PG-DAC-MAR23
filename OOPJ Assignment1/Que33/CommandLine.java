import java.util.Scanner;

public class CommandLine {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java CommandLineArithmetic <int> <float> <double>");
            return;
        }

        int intValue = Integer.parseInt(args[0]);
        float floatValue = Float.parseFloat(args[1]);
        double doubleValue = Double.parseDouble(args[2]);

        System.out.println("Integer Value: " + intValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter arithmetic operation (+,-,*,/):");
        char operator = scanner.next().charAt(0);
        scanner.close(); // close the scanner explicitly

        switch (operator) {
            case '+':
                System.out.println("Result: " + (intValue + floatValue + doubleValue));
                break;
            case '-':
                System.out.println("Result: " + (intValue - floatValue - doubleValue));
                break;
            case '*':
                System.out.println("Result: " + (intValue * floatValue * doubleValue));
                break;
            case '/':
                System.out.println("Result: " + (intValue / floatValue / doubleValue));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}

//javac CommandLine.java

//java CommandLine       
// Usage: java CommandLineArithmetic <int> <float> <double>

// C:\Users\SURAJ\Desktop\OOPJ\Assignment1\Que33>javac CommandLine.java

// C:\Users\SURAJ\Desktop\OOPJ\Assignment1\Que33>java CommandLine 7 7.0f 7.7
// Integer Value: 7
// Float Value: 7.0
// Double Value: 7.7
// Enter arithmetic operation (+,-,*,/):
// *
// Result: 377.3

