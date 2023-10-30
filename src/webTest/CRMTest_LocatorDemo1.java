package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CRMTest_LocatorDemo1 {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/");
		
		
		//NoSuchElementException
		//driver.findElement(By.name("priyanka")).click();
		//signin link <a>Link Text </a>
		
		//driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.partialLinkText("In")).click();
		
		//login functionality
		//email 
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.name("password-name")).sendKeys("test123");
		
		//checkbox
		driver.findElement(By.id("remember")).click();
		
		
		//submit btn
		driver.findElement(By.id("submit-id")).click();
		
		
		
		
		
		
		
		

	}

}
