import java.util.Scanner;

class Voter{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age:");
		int a = sc.nextInt();
		
		if(a >= 18)
		{
			System.out.println("Are you citizen of India ... Yes or No");
			String str = sc.next();
			if(str.equals("Yes"))
			{
				System.out.println("You are eligible for Voting");
			}				
			else System.out.println("SORRY...You are not eligible for Voting");		
		}
		else System.out.println("SORRY...You are not eligible for Voting");		
	}
}
/* F:\PG - DAC Class\Logic Building\LB Assignment 1>javac Voter.java

F:\PG - DAC Class\Logic Building\LB Assignment 1>java Voter
Enter your Age:
27
Are you citizen of India ... Yes or No
Yes
You are eligible for Voting   */