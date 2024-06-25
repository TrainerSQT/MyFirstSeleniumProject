package day8;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();	
		
		Logic obj = new Logic();
		boolean b = obj.Chek_Condition(x , y);
		boolean b1 = obj.Chek_Condition2(x,y,z);
		
		System.out.println(b + " " + b1);
	}
	
}
