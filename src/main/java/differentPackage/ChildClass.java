package differentPackage;

import accessModifires.ParentClass;

public class ChildClass extends ParentClass {
	public static void main(String[] args) {
		ParentClass.protectedStaticMethod();
		protectedStaticMethod();
		
		ParentClass obj=new ParentClass();
		obj.publicMethod();
		//obj.protectedMethod();  // don't allow has relation in differentPackage
	}
	
	public  void method1() {
		ParentClass.protectedStaticMethod();
		protectedStaticMethod();
		protectedMethod();
	}
}
