package firstProject;

public abstract class MobileUser {
	private String name; // User name
	private String planName; // User planName
	private int userID;
	String Service_provider;
	     //   boolean status;
	        
	
	
//	public MobileUser (String n, String p, int u, String S) {
//		name = n;
//		planName= p;
//		userID=u;
//		Service_provider = S;
//	}
//	
	public abstract void call(); 
	public abstract void text();
	public abstract void browse();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Name: "+ name);
		
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
		System.out.println("planName: "+ planName);
	}
	
	public int getuserID() {
		return userID;
	}
	public void setuserID(int userID ) {
		this.userID = userID;
		System.out.println("userID:" +userID);
	}
	

	public void setService_provider(String Service_provider) {
		this.Service_provider = Service_provider;
		System.out.println("Service_provider: "+Service_provider);
	}
	
	
//	public void setS_provider(boolean status ) {
//		
//		if(Service_provider.equals("Tmobile"));
//		this.status = status;
//		}
//			
		
	
	
	
	
	
	
	
	
}