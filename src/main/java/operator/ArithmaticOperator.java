package operator;

public final class ArithmaticOperator {

	public static void main(String[] args) {
		modulus();
		increment();
		decrement();

	}
	
	public static void regularOperator() {
		
		
	}
	
	
	public static void modulus() {
		double money=100.70;
		int divider=3;
		double modulation=money%divider;
		System.out.println(modulation + " is the the result");
	}
	
	//increment
	public static void increment() {
	  int orange=3;
	  for (int i = 0; i <= orange; i++) {
	   System.out.println(i);
	  }
	  int apple=10;
	  for (int i = 0; i <= apple; i+=5) {
	   System.out.println(i);
	  
	  }
	  
	}
	
	//decreement
		public static void decrement() {
		  int orange=0;
		  for (int i = 3; i >= orange; i--) {
		   System.out.println(i);

	
	
}
		}
}