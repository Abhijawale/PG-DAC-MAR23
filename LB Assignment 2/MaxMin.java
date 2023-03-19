import java.util.Scanner;

class MaxMin{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, max, min;
		System.out.println("Enter numeber 1");
		a = sc.nextInt();
		System.out.println("Enter numeber 2");
		b = sc.nextInt();
		System.out.println("Enter numeber 3");
		c = sc.nextInt();
		
		max =(a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println("Maximum number among " + a + ", " + b + " and " + c + " is " + max);
		
		min =(a < b) ? (a < c ? a : c) : (b < c ? b : c);
		System.out.println("Minimum number among " + a + ", " + b + " and " + c + " is " + min);
	}
}
/* F:\PG - DAC Class\Logic Building\LB Assignment 1>javac MaxMin.java

F:\PG - DAC Class\Logic Building\LB Assignment 1>java MaxMin
Enter numeber 1
27
Enter numeber 2
12
Enter numeber 3
96
Maximum number among 27, 12 and 96 is 96
Minimum number among 27, 12 and 96 is 12     */