class Pattern17{
	public static void main(String args[])
	{
	   int k=1;
	   for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print(k + " ");
				k++;
            }
            System.out.println();
		
        }
	 
	}
}

/* F:\PG - DAC Class\Logic Building\Pattern>javac Pattern17.java

F:\PG - DAC Class\Logic Building\Pattern>java Pattern17
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15 */