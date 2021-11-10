package pojo;

public class PojoClass {

	public static void main(String[] args) {
		Car camary = new Car(4, 4, 2, 2200);
           camary.headlightOn("day");
           Car sienna = new Car(0, 0, 0, 0);
	}

}

  class Car {
	  
	  
	  int wheel;
	  int seats;
	  int headlight;
	  double value;
	  
	  
	  public Car(int seats, int wheel, int headlight, double value) {
		super();
		this.seats = seats;
		this.wheel = wheel;
		this.headlight = headlight;
		this.value = value;
		
		System.out.println("car seats" + seats +"car wheel "+ wheel +"headlight  "+ headlight);
		
		
		
	}
	
	  
	  public Car() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void headlightOn(String input) {
			  
			  if(input.equalsIgnoreCase("dark")) {
				 System.out.println("please turn headlights on");
				  
			  }else {
				  System.out.println("head lights off");
			  }
				  
			  }
			  
	  
	  
	
	
	
	
	
	
	
	
}

