package appfeatures;

public class AppLogin {
	
	public boolean login(String username, String password) {
		
		boolean login_status = false;
		
		if(username.equals("test") && password.equals("test")) {
			login_status = true;
		}
		else if(!username.equals("test") && !password.equals("test")) {
			login_status = false;
		}
		return login_status;
	}

}
