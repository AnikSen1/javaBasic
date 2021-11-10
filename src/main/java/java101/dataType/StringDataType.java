package java101.dataType;

public class StringDataType {

	public static void main(String[] args) {
		fullName();
		

	}
	
	public static void fullName() {
		String firstName = "Anik ";
		String lastName = " Sen";
		String fullName = firstName + lastName;
		System.out.println(fullName);
		
		String fullName1= firstName +" "+ lastName;
		System.out.println(fullName1);
		System.out.println("My full name is : " + fullName);
	}

}
