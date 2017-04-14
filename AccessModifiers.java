package jums;

public class AccessModifiers {
	//static is used to create an object without instantiation
	public static int myInt=40;
	private static double myDouble=3535.9870;
	protected static String myString="am juma";
	static char myChar='a';
	public static void main(String args[]){
		
    System.out.println("your integer is "+myInt);
    System.out.println("your double is "+myDouble);
    System.out.println("your String is "+myString);
    System.out.println("your character is "+myChar);
    System.out.println("your integer is "+myInt);
    System.out.println("your integer is "+myInt);
	}

}