package variable;

public class InstanceVariable {
	 String firstName ;
	 public static void main(String[] args) {
	 
	  InstanceVariable b = new InstanceVariable();
	  
	  System.out.println(b.firstName);
	  b.methodOne();
	  b.methodTwo();
	 }
	 public void methodOne() {
	  firstName = "Jayed";
	  System.out.println(firstName);
	 }
	 public void methodTwo() {
	  firstName = "Faruq";
	  System.out.println(firstName);
	 }
	}

