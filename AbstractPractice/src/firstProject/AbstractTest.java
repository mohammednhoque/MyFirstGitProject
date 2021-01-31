package firstProject;

public class AbstractTest {

	public static void main(String[] args) {
		
	
		MobileUser mobileUser = new TMobileUser ();
		mobileUser.call();
		mobileUser.text();
		mobileUser.browse();
		mobileUser.setuserID(101);
		mobileUser.setPlanName("Monthly");
		mobileUser.setService_provider("tmobile");
		mobileUser.setName("Tamim");
		TMobileUser.mms("videoService");

		MobileUser mu = new VerizonUser ();
mu.browse();
mu.call();
mu.getName();
		
}

}
