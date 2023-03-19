import java.util.Scanner;

class Grade{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter percentage marks:");
		double per = sc.nextDouble();
		
		if(per >= 95)
		{
			System.out.println("Excellent: You got Distinction with Grade A+");
		}
		else if(per >= 85 && per < 95 )
		{
			System.out.println("Very Good: You got First division with Grade A");
		}
		else if(per >= 75 && per < 85)
		{
			System.out.println("Good: You got Second division with Grade B");
		}
		else if(per >= 60 && per < 75)
		{
			System.out.println("Satisfactory: You got Grade C");
		}
		else if(per >= 40 && per < 60)
		{
			System.out.println("Work Hard: You got Grade D");		
		}
		else 
		{
			System.out.println("Failed: Work hard for next time");
		}
	}
}
/* F:\PG - DAC Class\Logic Building\LB Assignment 1>javac Grade.java

F:\PG - DAC Class\Logic Building\LB Assignment 1>java Grade
Enter percentage marks:
97
Excellent: You got Distinction with Grade A+   */