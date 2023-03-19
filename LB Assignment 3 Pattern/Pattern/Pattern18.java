class Pattern18{
	public static void main(String args[])
	{
	   int alpha=65;
	   for (int i=1; i<=5; i++)
        {
            for (int j=1; j<=5-i+1; j++)
            {
                System.out.print((char)(alpha+j-1) + " ");
            }
            System.out.println();
        }
	 
	}
}

/* F:\PG - DAC Class\Logic Building\Pattern>javac Pattern18.java

F:\PG - DAC Class\Logic Building\Pattern>java Pattern18
A B C D E
A B C D
A B C
A B
A */