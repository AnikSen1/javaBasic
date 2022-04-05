package accessModifires;

public class DifferentClass {

	public static void main(String[] args) {
		ParentClass.protectedStaticMethod();
		
		ParentClass obj=new ParentClass();
		obj.publicMethod();
	    obj.protectedMethod();
	    obj.defaultMethod();
	   // obj.privateMethod(); //has no access
		
	}
}
	
	
	    

	
  


