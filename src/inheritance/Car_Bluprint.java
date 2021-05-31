package inheritance;

public class Car_Bluprint {
	
	    
			protected String name;
	    
	    
			public Car_Bluprint(String name) {
		    this.name = name;
	    	}	
	    	
	    	
			public void cardoor() {
				
				System.out.println(this.name   +"  :  this is a 4 door SUV");
			}
			
			public void Engine() {
				System.out.println(this.name  + "  : This is a autometic 4X4 and 4-cylider!!!!");
				
			}
			
			
			
			
			
			public void color() {
				
				String [] color = new String[] {"Black,Red,Green,WHite,BLUE"};	
				
				for(int i = 0; i < color.length ; i++) {
					System.out.println("Choose your color from  --- "  + color[i]);
								
			}
			
	    	
	    }
	    
	    
	
				













}

