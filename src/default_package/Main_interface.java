package default_package;

public class Main_interface {

	public static void main(String[] args) {
		
		
		Loops loo = new Loops();
		loo.Loop();
		
		System.out.println("///////////////////");
		
		Human_Interface human = new Human_Interface("Sarif");
		human.eat();
		human.exercise();
		human.sleep();
		
		System.out.println("_______________________");
		
		
		Sarah saru = new Sarah("sarah");
		
		saru.eat();
		saru.exercise();
		saru.sleep();
		
		
		System.out.println("*********************");
		
		Nappin nappin = new Nappin("Nappin");
		
		nappin.eat();
		nappin.exercise();
		nappin.sleep();
		
		
		
		
	}

}
