class Solution {
    public static void main(String[] args) {
        // Check if a command line argument is provided
        if (args.length == 0) {
            System.out.println("Please enter a character as a command line argument.");
            return;
        }

        //  first character from the command line argument
        char ch = args[0].charAt(0);

        // Check if the character is a letter or digit
        if (Character.isDigit(ch)) {
            System.out.println("The entered character is a digit.");
            System.out.println("Value: " + ch);
            System.out.println("Code Point: " + (int) ch);
        } else if (Character.isLetter(ch)) {
            System.out.println("The entered character is a letter.");

            // Check if the letter is in lowercase
            if (Character.isLowerCase(ch)) {
                // Convert to uppercase and print its code point
                char upper = Character.toUpperCase(ch);
                System.out.println("Uppercase: " + upper);
                System.out.println("Code Point: " + (int) upper);
            } else {
                // Convert to lowercase and print its code point
                char lower = Character.toLowerCase(ch);
                System.out.println("Lowercase: " + lower);
                System.out.println("Code Point: " + (int) lower);
            }
        } else {
            System.out.println("The entered character is not a letter or digit.");
        }
    }
}
// javac Solution.java

// java Solution
// Please enter a character as a command line argument.

// javac Solution.java

// java Solution A     
// The entered character is a letter.
// Lowercase: a
// Code Point: 97
