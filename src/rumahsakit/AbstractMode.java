package rumahSakit;

import static rumahSakit.CommonUtils.print;
import static rumahSakit.CommonUtils.println;
import static rumahSakit.CommonUtils.scanner;

import java.util.Scanner;


/***
 * 
 * @author NICO_ARDIAN
 *
 */
public abstract class AbstractMode implements OperationMode {

	protected boolean loggedIn;// = true; // enable this flag to bypass authentication
	
	@Override
	public boolean login() {
		if(!loggedIn) {
			Scanner scan = scanner();
			print("Enter username : ");
			String username = scan.next(); 
			print("Enter password : ");
			String password = scan.next();
			if(DataBase.exists(new User(username, password, "", "", 1))) {
				println(">>>>>>>>>>>>>>>> Login Successful!");
				loggedIn = true;
			}else {
				println(">>>>>>>>>>>>>> Invalid Credentials!! Please try again!!!");
				loggedIn = false;
			}	
		}
		return loggedIn;
	}

	@Override
	public void logout() {
		loggedIn = false;
		println(">>>>>>>>>>>>>>>>> Logout Successful!");
	}

}
