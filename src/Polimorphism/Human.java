package Polimorphism;


public class Human {
	   String name;
	
	   		public	Human(String name ){
				this.name = name;
			}

	   				public void travel(TransPort t, String destination) {
	   				System.out.println(this.name   +     "   :   traveling to  " + destination + " By " + t.name);

             }

}	   				
	   		class Bus extends TransPort {
            public Bus(String name) {
					super(name);
					
				}

			String name;
            
            	
					
				}
	   			
	   		  				
	   		class car extends TransPort{

				public car(String name) {
					super(name);
					
				}
	  		}				
	   				
	  class TransPort{
		  
		  String name;
		  
		  
		  public TransPort(String name) {
			  
			  this.name = name;
		  }
		  
  } 				
	   				
	   				
	   				
	   				
	   				
	   				
	  
	   				
	   				
	   				
	   				
	   				
	   				
	   				
	   				
	   				
	   				
	   				
	   				
	   				
	   				
	   				
	   				
