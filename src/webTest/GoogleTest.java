package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args)
	{

		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		//to open application
		driver.get("https://www.google.com");
		
		//to get the current title
		String actTitle=driver.getTitle();
		
		System.out.println("Application title is: "+actTitle);
		
		

	}

}
