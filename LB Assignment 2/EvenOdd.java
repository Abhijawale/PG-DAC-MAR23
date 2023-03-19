import java.util.Scanner;

class EvenOdd{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numeber ");
		int n = sc.nextInt();
		
		String result =((n%2 == 0)? "Even" : "Odd");
		System.out.println("The given number " +n+ " is " +result);
	}
}

/* F:\PG - DAC Class\Logic Building\LB Assignment 1>javac EvenOdd.java

F:\PG - DAC Class\Logic Building\LB Assignment 1>java EvenOdd
Enter numeber
12
The given number 12 is Even   */