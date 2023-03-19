class Pyramid5{
	public static void main(String args[])
	{
		
		for(int i=9; i>=1; i--){
			for(int k=1; k<i; k++){
				System.out.print("  ");
			}for(int j=i; j<=9; j++){
				System.out.print(j+" ");
			}for(int j1=8; j1>=i-1+1; j1--){
				System.out.print(j1+" ");
			}System.out.println();
		}
	}
}
/* F:\PG - DAC Class\Logic Building\Assignment 2\Pyramid>javac Pyramid5.java

F:\PG - DAC Class\Logic Building\Assignment 2\Pyramid>java Pyramid5
                9
              8 9 8
            7 8 9 8 7
          6 7 8 9 8 7 6
        5 6 7 8 9 8 7 6 5
      4 5 6 7 8 9 8 7 6 5 4
    3 4 5 6 7 8 9 8 7 6 5 4 3
  2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1   */