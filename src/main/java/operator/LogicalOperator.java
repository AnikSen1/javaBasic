package operator;

public class LogicalOperator {

	public static void main(String[] args) {
		andOperator();
		orOperation();
		altternateIf();
		
	}
	public static void andOperator() {
		int voteAge=10;
		int presidentAge=25;
		int yourAge=27;
		if(voteAge<=yourAge) {
			System.out.println("You can vote");
		}
		
		if (voteAge<=yourAge & presidentAge<=yourAge) {
			System.out.println("You can vote and can run for president");
		}
		else if(voteAge<=yourAge) {
			System.out.println("You can only vote");
		}
		else {
			System.out.println("You can not even vote");
			
		}
		
	}
	
	public static void orOperation() {
		int money=40000;
		int fatherHave=60000;
		int youHave=30000;
		if(youHave>=money|fatherHave>=money) {
			System.out.println("You can marry");
		}
		else {
			System.out.println("You can not merry");
		}
	
				
		
		}
		
	 public static void altternateIf() {  
		    int time = 20;
		    String result=(time < 18) ? "Good day." : "Good evening.";
		    System.out.println(result);
		  
	}
}
	


