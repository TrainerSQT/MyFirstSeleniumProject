package exceptionhandling;

public class Constr {	
	//global : instance : inside a class but out side a method
	//local : inside a method body
	int a;	
	Constr(int a)
	{		
		this.a = a;
	}	
	void Disp()
	{
		System.out.println(a);
	}	
	public static void main(String[] args) {
		Constr obj = new Constr(10);
		obj.Disp();
	}
}
