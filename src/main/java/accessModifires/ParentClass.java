package accessModifires;

public class ParentClass {

	public static void main(String[] args) {
		      
		ParentClass obj = new ParentClass();
	        obj.publicMethod();
	        obj.protectedMethod();
	        obj.defaultMethod();
	        obj.privateMethod();

	}
	
	public  void publicMethod() {
	    System.out.println("I am public m1 method");    
	    }
	protected  void protectedMethod() {
	    System.out.println("I am protected m2 method");    
	    
	    } 
	 void  defaultMethod() {
	    System.out.println("I am default m3 method");    
	}
	private  void privateMethod() {
	    System.out.println("I am private m4 method");    
	}
	
	
	protected static void protectedStaticMethod() {
	    System.out.println("I am static protected  method");    
	    
	    } 


}
