package day7;

public class Calcu {
	
	public static void main(String[] args) {	
		//dynamic calling 		
		//classname objname = new classname();
		//objname.methodname();
		
		Calcu obj = new Calcu();
		obj.Add();
		obj.Sub();		
	}	
	void Add()
	{
		int a= 10 , b=20;
		int c = a + b ;
		System.out.println(c);
	}	
	void Sub()
	{
		int a= 10 , b=20;
		int c = a - b ;
		System.out.println(c);
	}
}
