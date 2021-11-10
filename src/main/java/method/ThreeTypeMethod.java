package method;

public class ThreeTypeMethod {

	
	
	
	public static void main(String[] args) {
		ThreeTypeMethod obj=new ThreeTypeMethod();
		method1();                                  //call for running-- regular type method
		obj.method2(10,20,2.4f, 10<20, "red");     //call for running-- parameterized type method
		obj.returnMethod3();                      //call for running-- return type method
		returnMethod4();
	}
	

	
	
	
	public static void method1() {                                                 //regular type method and static method
		
	
	
		int a=10, b=20;
		float a1=2.3f;
		boolean is= a==b;
		float add=a+b+a1;
		
		
		System.out.println("Total value is "+ add);              //Concatenation
		System.out.println("10 is greater 20 is " + is);        //Concatenation
	}
	
	
	


        public void method2(int a, int b, float a1, boolean is, String color) {   //parameterized type method and instance method
		
		
		float add=a+b+a1;
		
		
		System.out.println("          Total value is "+ add);      //Concatenation
		System.out.println("          10 is greater 20 is " + is);//Concatenation
	}

	
	
	
	
	
	public float returnMethod3() {                                               //return type method and instance method
		
	
		int a=10;
		int b=20;
		float a1=2.4f;
		
		int add1=a+b;
		int add2=a+2*b;
		float add3=a+a1;
		System.out.println(add1);
		System.out.println(add2);
		System.out.println(add3);
		return add1 + add2 + add3;   //The "&" operator undefined for integer and float, so we have to use "+" operator
	
		
	}
	
	
	
	
	public static float returnMethod4() {                                     //return type method and static method
		
		
		int a=100;
		int b=200;
		int add1=a+b;
		int add2=a+2*b;
		
		System.out.println(add1);
		System.out.println(add2);
		
		return add1 & add2;
	
		
	}
} 
