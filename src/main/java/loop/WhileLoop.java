package loop;

public class WhileLoop {

	public static void main(String[] args) {
		method();
		method1();

	}
	public static void method() {
		int a=0;
		while(a<5) {
			System.out.println(a);
			a++;
		}
	}
	public static void method1() {
		int i=26;
		do {
			System.out.println(i);
			i++; 
		}                           //Do not forget to increase the variable 	
		                               //used in the condition, 
		while(i<=29);             //otherwise the loop will never end!
}
		
	}
	


