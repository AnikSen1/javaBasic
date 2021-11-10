package operator;

public class RelationalOrCompareson {

	public static void main(String[] args) {
		equal();

	}
	
	public static void equal() {
		
		String fruit="orenge";
		String vegetable="squash";
		boolean isIt=fruit==vegetable;
		System.out.println(isIt);
		
		boolean isNot=fruit!=vegetable;
		System.out.println("Fruit is not equal to vegetable " + isNot);
		
		int bill=10;
		int note=5;
		boolean isIt1=bill>note;
		System.out.println(isIt1);
		
		boolean isIt2=bill>=note;
		System.out.println(isIt2);
		boolean isIt3=bill<note;
		System.out.println(isIt3);
	}
	

}
