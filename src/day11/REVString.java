package day11;

public class REVString {
	
	REVString()
	{
		String name = "Tech" , store= "";		
		char rev ;		
		for(int i=0;i<name.length();i++)
		{
			rev = name.charAt(i);			
			store = rev + store;
		}		
		System.out.println(store);		
	}	
	
	public static void main(String[] args) {		
		REVString obj = new REVString();
	}	
}
