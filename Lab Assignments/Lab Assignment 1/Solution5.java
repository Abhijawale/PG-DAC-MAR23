import java.util.Scanner;

class Solution5{ 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Please enter a string: ");
            input = scanner.nextLine();

            if (input.matches("^[a-zA-Z\\s]*$")) {
                // Input contains only letters and spaces, exit loop
                break;
            } else {
                System.out.println("Invalid input. Please enter a string.");
            }
        }
        System.out.println("You entered: " + input);

        // Count the number of words in the input
        String[] words = input.trim().split("\\s+");
        int numWords = words.length;
        System.out.println("The input contains " + numWords + " words.");
    }
}





