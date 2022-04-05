package twoTypeCastingInPrimitiveDataType;

public class WideningOrAutomaticConverting {

	public static void main(String[] args) {  
		
											   //Widening Casting (automatically) - converting a smaller type to a larger type size
											  //            byte < short < char < int  < long  <float < double

										
		smallerToLargerDataType();											  
	}
	

	public static void smallerToLargerDataType() {

	byte byteNumber=10;                              //smaller to larger dataType(byte to double)
	short c1=byteNumber; //Don't need to write again the new dataType in the value 
	int c2=byteNumber;                             //1byte= 8bits
	long c3=byteNumber;
	float c4=byteNumber;
	double c5=byteNumber;
	
	float c6=c1*byteNumber;
	float c7=c3*c2;
	float c8=c4*c1;
	double c9=c4*c1;
	

	
	
	
	
	
	System.out.println(byteNumber);
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c5);
	}
	

}
