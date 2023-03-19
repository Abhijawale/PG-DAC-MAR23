class Star16{
	public static void main(String args[])
	{
		for(int i=1; i<=5; i++)
		{
			for (int k=5; k>i; k--)
            {
                System.out.print(" ");
            }
			for (int j=1; j<=i; j++)
            {
                if(j == 1 || j == i || i == 5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
			System.out.println();
		}
	}
}

/* F:\PG - DAC Class\Logic Building\Assignment 2\Star Pattern>javac Star16.java

F:\PG - DAC Class\Logic Building\Assignment 2\Star Pattern>java Star16
    *
   **
  * *
 *  *
*****    */