package day12interface;

public class A implements I1 , I2{	
	
	public static void main(String[] args) {		
		A obj = new A();
		obj.ABC();
	}

	@Override
	public void ABC() {
		
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
