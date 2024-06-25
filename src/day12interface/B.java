package day12interface;

public class B implements I1,I2 {
	
	public static void main(String[] args) {
		
		B obj = new B();
		obj.ABC();
	}

	@Override
	public void ABC() {		
		System.out.println(a+b);
	}

}
