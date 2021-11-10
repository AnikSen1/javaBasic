package loop;

public class ForLoop {

	public static void main(String[] args) {
		method();
		method1();

	}
	public static void method() {  //Use a for loop to print "Yes" 5 times:
	for(int i=0; i<3; i++) {
		System.out.println("yes");}
		
		//This example will only print even values between 0 and 6:
		for(int a=2; a<=6; a=a+2) {
			System.out.println(a);
			}
	}
		
		public static void method1() {
			int b=2;
		
		while(b<=6) {
		System.out.println(b);
		b=b+2;
	}
		}
		
}

