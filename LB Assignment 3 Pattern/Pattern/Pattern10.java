class Pattern10{
	public static void main(String args[])
	{
	
	   int alpha = 65;
	   for (int i = 5; i >= 1; i--)
        {            
			for (int s = 1; s <= i; s++)
            {
                System.out.print(" ");
            }
            for (int j = i; j <=5; j++)
            {
                System.out.print((char)(alpha+j-1) + " ");
               	
            }
            System.out.println();
        }	
	}
}

/* F:\PG - DAC Class\Logic Building\Pattern>javac Pattern10.java

F:\PG - DAC Class\Logic Building\Pattern>java Pattern10
     E
    D E
   C D E
  B C D E
 A B C D E */
 
