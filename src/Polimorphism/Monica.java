package Polimorphism;

public class Monica  {
	
					   public void Object() {
						
						Human monica = new Human("monica");
						TransPort b  = new Bus("Shohag EnterPrise");
						TransPort t  = new car("Lexus");
						TransPort P  = new TransPort("Air Pacific");
						train     L  = new train("Train-ParaBat");
						
						monica.travel(b, "dhaka");
						monica.travel(t, "chittagong");
						monica.travel(P, "New York");
						monica.travel(L, "Sylhet");
						
}

}
