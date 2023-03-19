class Pyramid13{
	public static void main(String args[])
	{
		
		for(int i=1; i<=6; i++){
			for(int k=6; k>i; k--){
				System.out.print(" ");
			}for(int j=1; j<=i; j++){
				if((j==1)||(j==i)||(i==6))
                    System.out.print("* ");
                else
                    System.out.print("  ");
			}System.out.println();
		}
	}
}

/* F:\PG - DAC Class\Logic Building\Assignment 2\Pyramid>javac Pyramid13.java

F:\PG - DAC Class\Logic Building\Assignment 2\Pyramid>java Pyramid13
     *
    * *
   *   *
  *     *
 *       *
* * * * * *     */