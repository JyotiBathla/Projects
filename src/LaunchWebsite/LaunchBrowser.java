package LaunchWebsite;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;



public class LaunchBrowser {

	static WebDriver driver;
	
	public static void LaunchBrowser(String Browser,String URL) throws Exception{
		//WebDriver driver = CommonUtility.driver;
		String browser = Browser;
		if (browser.equals("Chrome")){
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		//Only local connections are allowed : chrome browser will launch on the same machine where code resides
		driver.get(URL);
		
		//Thread.sleep(2000);
		}
		else if (browser.equals("IE")){
		System.setProperty("webdriver.ie.driver","D:\\Selenium\\Jars\\IEDriverServer.exe");
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver = new InternetExplorerDriver(options);
		//Only local connections are allowed : IE browser will launch on the same machine where code resides
		driver.get(URL);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		}
		
		}
		
		
		
	}
	

