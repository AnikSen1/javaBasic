package differentPackage;

import accessModifires.ParentClass;

public class ByObject {

	public static void main(String[] args) {
		ParentClass obj=new ParentClass();
		obj.m1();
	    
	}

}

//public =jvm need to access main method. if it is other than public
// jvm will not be able to access
//static= jvm is not able to create object of any class. as a result main method has to static.
//void=jvm is not able to handle any return statement. so it has to be void.
//main=by defalut name. you only can chage it by customizing jvm.
//String[] args= basicly argument in the run configuration and much more......
