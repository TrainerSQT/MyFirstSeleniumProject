package day10;

class GP
{
	int a=90 , b=80;
}
class Parent extends GP
{
	void Add()
	{
		int c = a + b;
		System.out.println(c);
	}
}

public class Child extends Parent {	
	void Sub()
	{
		int c = a - b;
		System.out.println(c);
	}	
	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.Add();
		obj.Sub();
	}
}
