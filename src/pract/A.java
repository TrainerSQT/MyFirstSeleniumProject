package pract;
import java.util.Scanner;
public class A {	
	public static void main(String[] args) {		
		
		A obj = new A();
		obj.Swap();
	}
	
	static void Swap()
	{
		//Scanner sc = new Scanner(System.in);
		
		/*
		 * System.out.println("enter value"); int a = sc.nextInt(); int b =
		 * sc.nextInt(); int c = sc.nextInt(); c = a; a = b; b = c;
		 * System.out.println(a); System.out.println(b);
		 */
		
		String mob[] = {"abc","def","ghi"};
		for(int i=0;i<mob.length;i++)
		{
			System.out.println(mob[i]);
		}
		
	}
}
