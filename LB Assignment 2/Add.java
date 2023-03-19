import java.util.Scanner;

class Add{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numeber 1");
		int n1 = sc.nextInt();
		System.out.println("Enter numeber 2");
		int n2 = sc.nextInt();
		int result =((n1 > n2)? (n1+n2) : (n2-n1));
		System.out.println("The new number is " +result);
	}
}

/* F:\PG - DAC Class\Logic Building\LB Assignment 1>javac Add.java

F:\PG - DAC Class\Logic Building\LB Assignment 1>java Add
Enter numeber 1
54
Enter numeber 2
42
The new number is 96   */