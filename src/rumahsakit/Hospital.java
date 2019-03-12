package rumahSakit;

import static rumahSakit.CommonUtils.learnOptionFromUser;
import static rumahSakit.CommonUtils.showApplicationEntryOptions;
import static rumahSakit.CommonUtils.showBanner;
import rumahSakit.AdminMode;

/**
 * 
 * @author NICO_ARDIAN
 *
 */
public class Hospital {

	public static void main(String[] args) {
		showBanner();

		Hospital hmsApp = new Hospital();
		hmsApp.manage();
				
	}

	private void manage() {
		showApplicationEntryOptions();
		int mode = learnOptionFromUser();
		
		switch(mode) {
			case 1  : startAdminMode(); break;
			case 2  : System.out.println("2"); break;
			case 3  : System.out.println("3"); break;
			case 4  : System.out.println("4"); break;
			default : System.out.println("default"); break;	
		}
	}

	private void startAdminMode() {
		AdminMode adminMode = new AdminMode();
		adminMode.operate();
	}

	
}
