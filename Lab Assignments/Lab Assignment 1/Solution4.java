import java.util.Scanner;

class Solution4 {
    
	public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Enter a string: ");
            input = sc.nextLine().toLowerCase();
            if (input.matches("[a-z]+")) {
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a string containing only alphabetic characters.");
            }
        }
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}