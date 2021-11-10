package polymorphism;
public class Overloading {
 public static void main(String [] args) {
		titi(10);
		titi(10,20);
		titi(10,20,30);

	}

	//same method and same dataType in parameter but different number of parameters is called overloading.
   //overloading is one kind of polymorphism.
	
	public static void titi(int a) {
		System.out.println(a);
	}
	public static void titi(int a, int b) {
		System.out.println(b);
	}
	public static void titi(int a, int b, int c) {
		System.out.println(c+2);
	}
	
}
