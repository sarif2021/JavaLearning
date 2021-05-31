package inheritance;

public class Car {

	public static void main(String[] args) {
		
		BMW 	car1  	= new BMW("It's a BMW x5");
		AUDI 	car2 	= new AUDI("It's a AUDI Q7");
		Civic 	car3	= new Civic("It's a Honda civic");
		
		car1.Engine();
		car1.color();
		System.out.println("***********");
		
		
		car2.Engine();
		car2.color();
		System.out.println("***********");
		
		
		
		car3.Engine();
		car3.color();
		System.out.println("***********");
		
		
		
	
		
		
	}

}
