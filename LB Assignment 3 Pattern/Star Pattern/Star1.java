class Star1{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/* F:\PG - DAC Class\Logic Building\Assignment 2\Star Pattern>javac Star1.java

F:\PG - DAC Class\Logic Building\Assignment 2\Star Pattern>java Star1
*
**
***
****
*****   */