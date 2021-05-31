package PrivateAccessModifier;

public class Private {
	
		
	private	String  model	=   "Bmw  X5"; 
	private	String color	=	"Black";
	
	private	int 	price	= 	86000;
	
	
	private	boolean Awd	= true;
	private	boolean Manuel = false;
	
	
	public void setModel(String s) {
		
	model = s;
		
	}
		
	
	public String getModel() {
		
		return model;
	}

	public String getColor() {
		return color;
	}

	public int getPrice() {
		return price;
	}

	public boolean isAwd() {
		return Awd;
	}

	public boolean isManuel() {
		return Manuel;
	}

	
	
	
	
	

	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setAwd(boolean awd) {
		Awd = awd;
	}

	public void setManuel(boolean manuel) {
		Manuel = manuel;
	}
	
	

}
