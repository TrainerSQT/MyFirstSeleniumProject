package day10;

class P1
{
	int a = 10 , b= 20;
}
class C1 extends P1
{
	void Cond()
	{
		if(a<b)
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}
	}
}
class c2 extends P1
{
	void Cond1()
	{
		if(a>b)
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}
	}
}
public class Hirerical {
	public static void main(String[] args) {		
		C1 obj = new C1();
		obj.Cond();
	}
}
