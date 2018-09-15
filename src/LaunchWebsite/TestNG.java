package LaunchWebsite;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG extends TestCases {

	
	
	@BeforeTest
	public static void TestCase0() throws Exception{
	
		TestCases.LaunchBrowser();
	}
	
	@Test(description="FisrtNameTextBox",groups="SmokeTest")
	public static void TestCase1() throws Exception{
		
		boolean A = TestCases.VerifyFirstName();
		Assert.assertTrue(A);
	}
	
	@Test(description="LastNameTextBox",groups="SmokeTest")
	public static void TestCase2() throws Exception{
		
		boolean B = TestCases.VerifLastName();
		Assert.assertTrue(B);
	
   }
	
	@Test
	public static void TestCase3() {
		
		TestCases.SendKeys_FirstName();
	}
	
	@Test
	public static void TestCase4() {
		
		TestCases.SendKeys_LastName();
	}
}

