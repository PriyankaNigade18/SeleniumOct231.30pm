package waitFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import generic.Utility;

public class ExplicitWaitDemo2 {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		//By locator
		By startbtn=By.xpath("//button[text()='Start']");
		By exptext=By.xpath("(//h4)[2]");
		
		
		driver.findElement(startbtn).click();
		String resText=Utility.presenceOfElement(driver,exptext).getText();
		
//		String resText=driver.findElement(exptext).getText();
		System.out.println(resText);
		
		
		

	}

}
