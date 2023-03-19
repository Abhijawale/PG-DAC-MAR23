class Pattern14{
	public static void main(String args[])
	{
	   for (int i=5; i>=1; i--)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }	 
	}
}

/* F:\PG - DAC Class\Logic Building\Pattern>javac Pattern14.java

F:\PG - DAC Class\Logic Building\Pattern>java Pattern14
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1 */

