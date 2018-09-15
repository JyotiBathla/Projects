package LaunchWebsite;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtility extends LaunchBrowser{


	
	public static boolean VisibilityOfWebElement(String xpath) throws Exception{
	
	boolean link = driver.findElement(By.xpath(xpath)).isDisplayed();

    return link;
		
	}
	
	public static boolean FindTextBox(String xpath, WebDriver driver){
		
		boolean TextBox = driver.findElement(By.xpath(xpath)).isDisplayed();
		return TextBox;
	}
	
	public static boolean getTitle(String ExpectedTitle){
		boolean Title;  
		String title = driver.getTitle();
		if(title == ExpectedTitle){
			Title = true;
		}
		else {
			Title = false;
		}
		return Title;
	}
	
	public static void Click(){
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	   
	   ArrayList<WebElement> primary = new ArrayList<WebElement>();
	   primary.addAll(driver.findElements(By.xpath("//ul[@id='primary-menu']/li/*")));
	   for(int j=0 ; j<primary.size(); j++){
		   
		   if(primary.get(j).getText().contains("DEMO SITES")){
			   primary.get(j).click();
		
		
		ArrayList<WebElement> List_Demo = new ArrayList<WebElement>();
		List_Demo.addAll(driver.findElements(By.xpath("//ul[@id='primary-menu']/li[8]/ul/li/*")));
		for(int i=0;i<List_Demo.size();i++){
			
			if(List_Demo.get(i).getText().contains("Handling Alerts using Selenium WebDriver")){
				List_Demo.get(i).click();
				break;
			}
		}
		break;
		}
	   }
	}
	
	
	public static void SendKeys(String xpath, String value){
		
		driver.findElement(By.xpath(xpath)).sendKeys(value);
		
	}
}
