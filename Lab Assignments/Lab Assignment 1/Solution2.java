import java.util.Scanner;
import java.util.Arrays;

class Solution2{
	
	static Scanner sc = new Scanner(System.in);
	static int[] acceptArray(int size){
        int[] arr = new int[size];
		
        //Read input and validate each element
	    for (int i = 0; i < size; i++) {
	        System.out.print("Enter element " + (i+1) + ": ");
	        while (!sc.hasNextInt()) {
	            System.out.print("Invalid input. Enter an integer: " + (i+1) + ": ");
	            sc.next();
	        }
	        arr[i] = sc.nextInt();
	    }
        return arr;
    }
	static void printArray(int[] arr){
		// Displaying the entered array using Arrays.toString()
        System.out.println("Entered array : " + Arrays.toString(arr));
	}
	static int sumArray(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }		
	public static void main(String[] args){
		
		System.out.print("Enter size of an array : ");
		int size = sc.nextInt();
		int[] arr = acceptArray(size);
		printArray(arr);
		
		int sum = sumArray(arr);
        System.out.println("Sum of array elements : " + sum);		
	}
}	
	