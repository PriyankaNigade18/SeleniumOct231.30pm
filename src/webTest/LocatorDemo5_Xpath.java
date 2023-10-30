package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo5_Xpath {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		//email
		driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test123");
		
		
		//button
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		//alert message
		//String msg=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
		String msg=driver.findElement(By.xpath("//div[contains(@class,'alert')]")).getText();
		System.out.println(msg);
		
		
		
	}

}
