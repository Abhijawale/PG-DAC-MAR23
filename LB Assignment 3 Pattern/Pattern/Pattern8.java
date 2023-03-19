class Pattern8{
	public static void main(String args[])
	{
	
	   for (int i = 5; i >= 1; i--)
        {
            for (int s = 1; s < i; s++)
            {
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }	
	}
}

/* F:\PG - DAC Class\Logic Building\Pattern>javac Pattern8.java

F:\PG - DAC Class\Logic Building\Pattern>java Pattern8
     5
    4 5
   3 4 5
  2 3 4 5
 1 2 3 4 5 */
 
