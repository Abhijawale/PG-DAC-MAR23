class Pattern6{
	public static void main(String args[])
	{
	
	for (int i=1; i<=5; i++) 
        {            
            for (int s=5; s>i; s--)   // Print space in decreasing order 
            {
                System.out.print(" ");
            }
            
            for (int j=1; j<=i; j++)  // Print star in increasing order
            {
                System.out.print("*");
            }
            System.out.println();
        }
	
	}
}

/* F:\PG - DAC Class\Logic Building\Pattern>javac Pattern6.java

F:\PG - DAC Class\Logic Building\Pattern>java Pattern6
    *
   **
  ***
 ****
***** */