package LaunchWebsite;

public class TestCases extends CommonUtility{
	
	public static void LaunchBrowser() throws Exception{
		
		LaunchBrowser.LaunchBrowser("Chorme", "http://demoqa.com/registration/");
	}

	public static boolean VerifyFirstName() throws Exception{
		
		boolean Condition = CommonUtility.VisibilityOfWebElement("\\input[@id='name_3_firstname']");
		return Condition;
		
	}
	
	public static boolean VerifLastName() throws Exception{
		
		boolean Condition = CommonUtility.VisibilityOfWebElement("\\input[@id='name_3_lastname']");
		return Condition;
		
	}
	
	public static void SendKeys_FirstName(){
		
		CommonUtility.SendKeys("\\input[@id='name_3_firstname']", "Jyoti");
		
	}
	
public static void SendKeys_LastName(){
		
		CommonUtility.SendKeys("\\input[@id='name_3_lastname']", "Bathla");
		
	}
}
