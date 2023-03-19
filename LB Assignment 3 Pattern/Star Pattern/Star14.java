class Star14{
	public static void main(String args[])
	{
		//Upper Triangle...
		for(int i=1; i<=5; i++)
		{			
			for(int k=1; k<i; k++){
				System.out.print(" ");			
			}for(int j=i; j<=5; j++){
				System.out.print("* ");			
			}System.out.println();
		}	
		//Lower Triangle...
		for(int i=4; i>=1; i--)
		{		
			
			for(int k=1; k<i; k++){
				System.out.print(" ");
			}for(int j=i; j<=5; j++){
				System.out.print("* ");
			}System.out.println();			
		}
	}
}
/* F:\PG - DAC Class\Logic Building\Assignment 2\Star Pattern>javac Star14.java

F:\PG - DAC Class\Logic Building\Assignment 2\Star Pattern>java Star14
* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *   */