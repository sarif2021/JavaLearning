package default_package;

public class Human_Interface {
	
			String name ;
			
			public Human_Interface(String name) {
				  this.name = name;
			}

			
			public void eat () {
				
				System.out.println(this.name + "  :    eat healthy food");
				
			}


			public void sleep (   ) {
				System.out.println(this.name + "  :    sleep  healthy ");
				
			}


			public void exercise () {
				System.out.println(this.name + "  :    Do exercise everyday");
			}






}
