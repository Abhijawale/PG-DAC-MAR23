class Pattern5{

	public static void main(String args[])
	{
		char c = 'A';
		for(int i=1;i<=5;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(c+" ");
				
			}
			c++;
			System.out.println();
		}
	
	}
	
}

/* F:\PG - DAC Class\Logic Building\Pattern>javac Pattern5.java

F:\PG - DAC Class\Logic Building\Pattern>java Pattern5
A
B B
C C C
D D D D
E E E E E */