package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException 
	{

		//create session
		WebDriver driver=new ChromeDriver();
		/*
		 * InvalidArgumentException: for wrong url address
		 */
		driver.get("https://google.com");
		
		//google --->facebook
		
		driver.navigate().to("https://www.facebook.com");
		
		
		Thread.sleep(2000);
		
		//back()
		driver.navigate().back();//google
		
		Thread.sleep(2000);
		//forward()
		driver.navigate().forward();//facebook
		Thread.sleep(2000);
		//refresh()
		driver.navigate().refresh();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
