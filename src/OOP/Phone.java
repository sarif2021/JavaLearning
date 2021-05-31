package OOP;

public class Phone {
	
		 String Model ="iphone";
	
	   public void call() {
		   
		  System.out.println("calling....unknown");
	   }
	   
	   
	   public void Text() {
		   
		    int [] numbers = new int[] {1234,234,678,9005,457,8897};
		    
		    
		    for(int i = 0 ; i <numbers.length ; i++ ) {
		   
		   
			  System.out.println("Text from....unknown  : " +  numbers[i]);
		   }
	   
	   }
	   
	   public void call( int number) {
		   
			  System.out.println("calling...    : "  + number);
			  
			  
		   }
	   
	   public void Phonemodel( ) {
		   
			  System.out.println("this is a    : "  + Model);
			  
			  
		   }
	   
	   
	   
	   
	   
	   

}
