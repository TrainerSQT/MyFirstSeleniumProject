package pract;

public class Loop1 {
	public static void main(String[] args) {
		
		/*
		 * //outer loop for(int i=1;i<7;i++) { //inner loop for(int j=1;j<=i;j++) {
		 * System.out.print(j); } System.out.println(); }
		 */
		
		
		for(int i=3;i>=1;i--)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
