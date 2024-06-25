package day11;

import java.util.Scanner;

//same method name but diff argument
public class MO {
	//default
	void A()
	{
		System.out.println("hello");
	}
	//paramter
	void A(int a)
	{
		System.out.println(a);
	}	
	void A(int a , int b)
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		MO obj = new MO();
		obj.A();
		obj.A(a);
		obj.A(a,b);
	}
}
