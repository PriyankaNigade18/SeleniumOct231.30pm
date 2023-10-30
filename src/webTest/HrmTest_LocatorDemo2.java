package webTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmTest_LocatorDemo2 {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		//username
		WebElement un=driver.findElement(By.name("username"));
		
		System.out.println("Is username displayed on the page?: "+un.isDisplayed());
		
		System.out.println("Is username enabled?: "+un.isEnabled());
		
		un.sendKeys("Admin");
		
		
		//password
		WebElement psw=driver.findElement(By.name("password"));
		if(psw.isDisplayed() && psw.isEnabled())
		{
			psw.sendKeys("admin123");
		}
		
		
		//login but
		//InvalidSelectorException: Compound class names not permitted
		//driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		
		
		driver.findElement(By.className("oxd-button")).click();
		
		
		
		
		
		
		
		
		

	}

}
