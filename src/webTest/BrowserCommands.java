package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) 
	{

		//create session
		WebDriver driver=new ChromeDriver();
		
		//get()
		driver.get("https://automationplayground.com/crm/");
		
		//getTitle()
		System.out.println("Application title: "+driver.getTitle());

		//getCurrentUrl()
		System.out.println("Application current url: "+driver.getCurrentUrl());
		
		//getPageSource()
		System.out.println(driver.getPageSource());
		
		//close() or quit()
		driver.quit();
		
		
		
	}
	
	

}
