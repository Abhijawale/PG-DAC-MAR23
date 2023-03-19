class Pyramid3{
	public static void main(String args[])
	{
		
		for(int i=1; i<=9; i++){
			for(int k=9; k>i; k--){
				System.out.print(" ");
			}for(int j=1; j<=i; j++){
				System.out.print("* ");
			}System.out.println();
		}
	}
}
/* F:\PG - DAC Class\Logic Building\Assignment 2\Pyramid>javac Pyramid3.java

F:\PG - DAC Class\Logic Building\Assignment 2\Pyramid>java Pyramid3
        *
       * *
      * * *
     * * * *
    * * * * *
   * * * * * *
  * * * * * * *
 * * * * * * * *
* * * * * * * * *    */