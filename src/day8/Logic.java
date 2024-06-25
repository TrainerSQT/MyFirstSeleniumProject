package day8;

public class Logic {
	
	boolean status;
	
	boolean Chek_Condition(int x , int y)
	{
		status = x<y;
		return status;
	}
	
	boolean Chek_Condition2(int x , int y , int z)
	{
		 status = (x<y && x>z);
		 return status;
	}
}
