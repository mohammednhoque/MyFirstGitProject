package firstProject;


	public class VerizonUser extends MobileUser {
		
	
		public VerizonUser () {
			
		}
		
		public void call() {
			System.out.println(getName() + " calling from Verizon");
		}
		
		public void text() {
			System.out.println(getName() + " texting from Verizon");
		}

		@Override
		public void browse() {
			System.out.println(getName()+ "people can browse");
			
		}
		
			
		}
	
	
	
	
	
	
	
	

