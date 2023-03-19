class Star12{
	public static void main(String args[])
	{
		//Upper Triangle...
		for(int i=1; i<=5; i++)
		{			
			for(int j=1; j<=5-i+1; j++){
				System.out.print("*");			
			}System.out.println();
		}	
		//Lower Triangle...
		for(int i=2; i<=5; i++)
		{		
			for(int j=1; j<=i; j++){
				System.out.print("*");
			}System.out.println();			
		}
	}
}
/* F:\PG - DAC Class\Logic Building\Assignment 2\Star Pattern>javac Star12.java

F:\PG - DAC Class\Logic Building\Assignment 2\Star Pattern>java Star12
*****
****
***
**
*
**
***
****
*****    */