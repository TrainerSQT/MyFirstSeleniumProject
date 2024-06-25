package day5;

public class Operators {	
	public static void main(String[] args) {		
		int a = 9 ,  b= 20 , c=0;
		double d = 9.80;
		double x = a + d;
		System.out.println(x);		
		int output = a + b + c;
		System.out.println(output);		
		
		if(a>b || b>c) //(9>20 (f) || 20>0 (t) )
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
