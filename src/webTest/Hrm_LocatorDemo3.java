package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hrm_LocatorDemo3 
{

	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//number of input boxes
		List<WebElement> inputboxes=driver.findElements(By.tagName("selenium"));
		System.out.println("Total input boxes: "+inputboxes.size());//0
		System.out.println(inputboxes);//[]
		
		//Number of Links
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+allLinks.size());//5
		
		//capture attribute href value for every link
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getAttribute("href"));
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
