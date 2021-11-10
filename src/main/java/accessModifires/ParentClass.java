package accessModifires;

public class ParentClass {

	public static void main(String[] args) {
		      m2();
		ParentClass obj = new ParentClass();
	        obj.m1();
	        obj.m3();
	        obj.m4();

	}
	
	public void m1() {
	    System.out.println("I am public m1 method");    
	    }
	protected static void m2() {
	    System.out.println("I am protected m2 method");    
	    
	    } 
	void m3() {
	    System.out.println("I am default m3 method");    
	}
	private void m4() {
	    System.out.println("I am private m4 method");    
	}


}
