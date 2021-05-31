package PrivateAccessModifier;

public class CarTest {

	public static void main(String[] args) {
		
		Private mycar = new Private();
		
		
		System.out.println(mycar.getModel());	
		System.out.println(mycar.getColor());	
		System.out.println(mycar.getPrice());	
		System.out.println(mycar.isManuel());	
			
		
		
		System.out.println("********************************"
						+ "	******************");
		
		
		
			mycar.setModel("Audi Q7");
			mycar.setColor("Grey");
			mycar.setPrice(58000);
			mycar.setManuel(false);
		
			
			System.out.println(mycar.getModel());	
			System.out.println(mycar.getColor());	
			System.out.println(mycar.getPrice());	
			System.out.println(mycar.isManuel());	
			
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
}
