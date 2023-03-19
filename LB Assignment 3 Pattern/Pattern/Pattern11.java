class Pattern11{
	public static void main(String args[])
	{
		  
	   for (int i=1; i<=5 ; i++)
        {            
			for (int k=4; k>=i; k--)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
               	
            }
			for (int j1=1; j1<i; j1++)
            {
                System.out.print("*");
               	
            }
            System.out.println();
        }
	
	}
}

/* F:\PG - DAC Class\Logic Building\Pattern>javac Pattern11.java

F:\PG - DAC Class\Logic Building\Pattern>java Pattern11
    *
   ***
  *****
 *******
********* */