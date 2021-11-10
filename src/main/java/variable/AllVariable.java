package variable;

public class AllVariable {
		int a=10;          //instance variable (inside the class but outside the method)
		static int b=20;  //static variable    (inside the class but outside the method with keyWord "static")
		
		
		
	public static void main(String[] args) {  //main method
		
		AllVariable object=new AllVariable();  //referential variable or class variable
		object.method1();
		
	}

	public void method1() {      //method
		double c=30.6;          //local variable
		double add=a+b+c;
		
	
		System.out.println(add); //print statement
	}
}