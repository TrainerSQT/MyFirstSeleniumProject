package day11;

//parent / super / base
class Parent
{
	void M()
	{
		System.out.println("parent");
	}
}

public class Child extends Parent {
	
	void M()
	{
		super.M();
		System.out.println("child");
	}
	public static void main(String[] args) {		
		Child obj = new Child();
		obj.M();
	}
}
