import java.util.Scanner;
class Factorial{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		int i = 1, f=1;
		
		if (i<=n);
		{
			for(i=1;i<=n;i++)
				f = f*i;
		}
		System.out.println("Factorial of "+n+" is "+f);
	}
}

/* F:\PG - DAC Class\Logic Building\LB Assignment 1>javac Factorial.java

F:\PG - DAC Class\Logic Building\LB Assignment 1>java Factorial
Enter Number:
5
Factorial of 5 is 120    */