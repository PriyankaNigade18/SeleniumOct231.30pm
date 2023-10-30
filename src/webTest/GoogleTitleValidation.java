package webTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleValidation {

	public static void main(String[] args) 
	{

		//Create session
		WebDriver driver=new ChromeDriver();
		//open application
		driver.get("https://www.google.com");
		//get the title
		String actTitle=driver.getTitle();
		System.out.println(actTitle);
		
		//validation
		if(actTitle.equals("Google"))
		{
			System.out.println("Title match...Test Pass!");
		}else
		{
		System.out.println("Title match .....Test Fail");	
		}
		
		//close the browser
		driver.quit();
		
		
		
		

	}

}
