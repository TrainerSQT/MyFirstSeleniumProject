package day12interface;

public class StringMethods {
	
	public static void main(String[] args) {		
		String name = "hello";
		String name2 = "HELLO";		
		System.out.println(name.length());
		System.out.println(name.concat("this is my class"));
		System.out.println(name.charAt(1));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.isEmpty());
		System.out.println(name.contains("e1"));
		System.out.println(name.equals("hello "));
		System.out.println(name.trim());		
		System.out.println(name.equalsIgnoreCase(name2));
		System.out.println(name.replace("he", "A"));		
	}
}
