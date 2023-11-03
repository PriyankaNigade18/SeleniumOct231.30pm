package handLingSolution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow_Tab {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		//new tab-->facebook
		WebDriver driver2=driver.switchTo().newWindow(WindowType.TAB);
		driver2.get("https://www.facebook.com");
		//newWindow-----amazon
		
		WebDriver driver3=driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver3.get("https://amazon.in");
		
		
		
		
		
		
		
		
		
	}

}
