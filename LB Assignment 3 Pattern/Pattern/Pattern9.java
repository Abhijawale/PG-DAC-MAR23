class Pattern9{
	public static void main(String args[])
	{
	
	   for (int i = 1; i <= 5; i++)
        {
            char c = 'A';
			for (int s=5; s>i; s--)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++)
            {
                System.out.print(c + " ");
				c++;
            }
            System.out.println();
        }
	
	}
}

/* F:\PG - DAC Class\Logic Building\Pattern>javac Pattern9.java

F:\PG - DAC Class\Logic Building\Pattern>java Pattern9
    A
   A B
  A B C
 A B C D
A B C D E */