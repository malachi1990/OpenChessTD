package org.openchessTD.online;

import org.openchess.beans.CrossTable;
import org.openchessTD.online.beans.Browser;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SubmitTourney {
	private String username;
	private String password;
	private String uscfSiteURL = "https://secure2.uschess.org/TD_Affil/TD_login.php";
	private Browser choice = Browser.FIREFOX;
			
	public void startTourneySubmission(String userID, String passWord, CrossTable event){
			FirefoxDriver driver = (FirefoxDriver) choice.getDriver(choice);
			
	}
}
