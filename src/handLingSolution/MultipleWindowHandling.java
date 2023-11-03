package handLingSolution;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args)
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//home page
	
	String parentId=driver.getWindowHandle();
	System.out.println(parentId);
	
	//link
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	//child window
	Set<String> allWindows=driver.getWindowHandles();
	System.out.println(allWindows);
	
	for(String childId:allWindows)//[55c,AAB]
	{
		//to switch child windows
		if(!parentId.equals(childId))
		{
			driver.switchTo().window(childId);
			//new child Window
			driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
			//driver.close();//-close current focus window
			//driver.quit();//-close all open windows by selenium
		}
		
	}
	
	//NoSuchSessionException: Session ID is null.
	//Using WebDriver after calling quit()?
	
	//switch back to the parent
	
	driver.switchTo().window(parentId);
	driver.findElement(By.name("username")).sendKeys("Admin");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
