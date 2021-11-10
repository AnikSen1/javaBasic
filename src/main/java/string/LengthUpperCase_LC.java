package string;

public class LengthUpperCase_LC {

	public static void main(String[] args) {
		length();
		position();

	}
	
	public static void length() {
		String grettings="Hellow";
		System.out.println(grettings.length());
		System.out.println(grettings.toUpperCase());
		System.out.println(grettings.toLowerCase());
	}

	public static void position() {
	String text="My name is Anik chandra sen";
	System.out.println(text.indexOf("is"));   // Java counts positions from zero.
											 //0 is the first position in a string, 
											//1 is the second, 2 is the third ...
}
}
