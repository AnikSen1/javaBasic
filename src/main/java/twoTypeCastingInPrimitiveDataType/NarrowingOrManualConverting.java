package twoTypeCastingInPrimitiveDataType;

public class NarrowingOrManualConverting {

	public static void main(String[] args) {
		
		largerToSmallerDataType();				 // Narrowing Casting (manually) - converting a larger type to a smaller size type
	                                            //         double -> float -> long -> int -> char -> short -> byte
	}
	
	
	public static void largerToSmallerDataType() { 
		
	double doubleNumber=9.3; //Larger to smaller dataType(double to byte)
	

	
	// you have to write again the new dataType in the value 
	
	
	
	  float fNumber=(float)doubleNumber; 
	  long lNumber=(long)doubleNumber; 
	  int iNumber=(int)doubleNumber;
	  
	  System.out.println(doubleNumber);
	  System.out.println(fNumber);
	  System.out.println(lNumber); 
	  System.out.println(iNumber);
	  
	  float $fNumber=3.8f;
	  
	  long _lNumber=(long)$fNumber; int _iNumber=(int)$fNumber; short
	  _sNumber=(short)$fNumber; byte _bNumber=(byte)$fNumber;
	  
	  
	  
	  System.out.println($fNumber); System.out.println(_lNumber);
	  System.out.println(_iNumber); System.out.println(_sNumber);
	  System.out.println(_bNumber);
	  
	 
}
	
	
}
