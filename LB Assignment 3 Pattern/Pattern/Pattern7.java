class Pattern7{
	public static void main(String args[])
	{
	
	   for (int i=1; i<=5; i++)
        {
            for (int s=5; s>=i; s--)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
	
	}
}

/* F:\PG - DAC Class\Logic Building\Pattern>javac Pattern7.java

F:\PG - DAC Class\Logic Building\Pattern>java Pattern7
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5 */