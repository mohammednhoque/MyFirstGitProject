package firstProject;

public class TMobileUser extends MobileUser {

		
//	public TMobileUser(String name, String planName, int userID, String S_Provider) {
//		super(name, planName, userID, S_Provider);
//		}


	public void call() {

		System.out.println("call:  call service");
	}

	public void text() {
		System.out.println("text: texting from TMobile");
	}

	public void browse() {

		System.out.println("browse: Web browser");
	}

	public static void mms(String mms) {
		System.out.println("mms: " +mms);
	}

	


	
	
}
