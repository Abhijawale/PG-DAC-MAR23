class Pyramid7{
	public static void main(String args[])
	{
		
		for(int i=9; i>=1; i--){
			for(int k=9; k>=i+1; k--){
				System.out.print(" ");
			}for(int j=i; j>=1; j--){
				System.out.print(i+ " ");
			}System.out.println();
		}
	}
}
/* F:\PG - DAC Class\Logic Building\Assignment 2\Pyramid>javac Pyramid7.java

F:\PG - DAC Class\Logic Building\Assignment 2\Pyramid>java Pyramid7
9 9 9 9 9 9 9 9 9
 8 8 8 8 8 8 8 8
  7 7 7 7 7 7 7
   6 6 6 6 6 6
    5 5 5 5 5
     4 4 4 4
      3 3 3
       2 2
        1      */