package exceptionhandling;

public class Error {	
	public static void main(String[] args) {		
		int a[] = {1,2,3,4};
		
		try {
		
			for(int i=0;i<=7;i++)
			{
				System.out.println(a[i]);
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
