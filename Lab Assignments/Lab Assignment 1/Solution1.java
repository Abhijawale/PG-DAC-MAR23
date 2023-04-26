import java.util.Scanner;

class Solution1{
	static void swap(int x, int y){
		x = x + y;
		y = x - y;
		x = x - y;
		print(x, y);
	}
	static void print(int x, int y){
		System.out.println("After swapping value's of x = " +x+ " and y = " +y);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a = sc.nextInt();
		System.out.print("Enter second number : ");
		int b = sc.nextInt();
		swap(a , b);
	}
}