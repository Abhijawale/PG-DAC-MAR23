import java.io.*;
import java.util.Scanner;
 
// Class of ReverseString
class Solution3 {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String input : ");
        String input = sc.nextLine();
 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1.reverse();
 
        // print reversed String
        System.out.println(input1);
    }
}
