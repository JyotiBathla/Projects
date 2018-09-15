
package LaunchWebsite;

import org.openqa.selenium.WebDriver;

public class MainMethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		LaunchBrowser.LaunchBrowser("Chrome","http://toolsqa.com/");
		CommonUtility.Click();
	    
		
	}

}
