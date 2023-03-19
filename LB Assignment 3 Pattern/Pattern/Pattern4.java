class Pattern4{

	public static void main(String args[])
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	
	}
	
}

/* F:\PG - DAC Class\Logic Building\Pattern>javac Pattern4.java

F:\PG - DAC Class\Logic Building\Pattern>java Pattern4
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5 */