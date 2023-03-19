class Pyramid1{
	public static void main(String args[])
	{
		
		for(int i=1; i<=9; i++){
			for(int k=9; k>i; k--){
				System.out.print(" ");
			}for(int j=1; j<=i; j++){
				System.out.print(i+ " ");
			}System.out.println();
		}
	}
}

/* F:\PG - DAC Class\Logic Building\Assignment 2\Pyramid>javac Pyramid1.java

F:\PG - DAC Class\Logic Building\Assignment 2\Pyramid>java Pyramid1
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9    */