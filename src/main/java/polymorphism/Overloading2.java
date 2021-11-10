package polymorphism;
public class Overloading2 {
	public static void main(String[] args) {
		 titi("white");
		 titi(1);
		 titi();	
	}
	
	
	//same method but different dataType in parameters is called overloading.
   //overloading is one kind of polymorphism.
	
	
	public static void titi(String color) {
		System.out.println(color);
	}
	
	public static void titi(int number) {
		System.out.println(number);
	}
	
	public static void titi() {
		int a=100;
		System.out.println(a);
	}
}
