class Star11{
	public static void main(String args[])
	{
		//Upper Triangle...
		for(int i=1; i<=5; i++)
		{			
			for(int k=1; k<i; k++){			
				System.out.print(" ");
			}for(int j=1; j<=5; j++){
				System.out.print("*");			
			}System.out.println();
		}	
		
	}
}

/* F:\PG - DAC Class\Logic Building\Assignment 2\Star Pattern>javac Star11.java

F:\PG - DAC Class\Logic Building\Assignment 2\Star Pattern>java Star11
*****
 *****
  *****
   *****
    *****   */