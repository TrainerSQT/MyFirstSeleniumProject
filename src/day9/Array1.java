package day9;

public class Array1 {
	
	public static void main(String[] args) {
		Arr();
	}
	
	static void Arr()
	{
		int a[] = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
		int len = a.length;
		System.out.println(len);
		
		for(int i=0;i<len;i++)
		{
			System.out.println(a[i]);
		}
	}
}
