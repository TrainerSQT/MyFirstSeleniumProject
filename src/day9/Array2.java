package day9;

public class Array2 {	
	public static void main(String[] args) {		
		int a[][] = { {1,2,3} , {4,5,6} , {7,8,9} };
		/*
		 * int len = a.length; System.out.println(len);
		 */
		
		//outloop
		for(int i=0;i<a.length;i++)
		{
			//inner loop
			for(int j=0;j<a.length;j++)
			{
				System.out.println(a[i][j]);
			}
			
		}		
	}
}
//i=0
//j=0