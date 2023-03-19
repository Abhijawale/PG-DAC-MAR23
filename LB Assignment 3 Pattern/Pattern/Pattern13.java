class Pattern13{
	public static void main(String args[])
	{
	
	   int alpha=65;
	   for (int i=1; i<=5; i++)
        {
            for (int k=4; k>= i; k--)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++)
            {
                System.out.print((char)(alpha+i-1) + " ");
            }
            System.out.println();
        }
	
	}
}

/* F:\PG - DAC Class\Logic Building\Pattern>javac Pattern13.java

F:\PG - DAC Class\Logic Building\Pattern>java Pattern13
    A
   B B
  C C C
 D D D D
E E E E E */