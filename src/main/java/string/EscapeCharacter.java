package string;

public class EscapeCharacter {
	
		  public static void main(String[] args) {
		     String txt1 = "We are the so-called \n Vikings from the north.";
		     String txt2 = "We are the so-called \r Vikings from the north.";
		     
		     String txt3 = "We are the so-called \t Vikings from the north.";
		     
		     String txt4 = "We are the so-called \f Vikings from the north.";
		     String txt5 = "We are the so-called \b Vikings from the north.";
		     
		     String txt6 = "We are the so-called \'Vikings\' from the north.";
		     String txt7 = "We are the so-called \"Vikings\" from the north.";
		     String txt8 = "We are the so-called \\ Vikings from the north.";
		     
		    System.out.println(txt1);
		     System.out.println(txt2);
		      System.out.println(txt3);
		       System.out.println(txt4);
		     System.out.println(txt5);
		      System.out.println(txt6);
		       System.out.println(txt7);
		     System.out.println(txt8);
		  }
		}

