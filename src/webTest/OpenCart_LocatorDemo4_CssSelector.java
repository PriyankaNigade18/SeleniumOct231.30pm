package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart_LocatorDemo4_CssSelector {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//tagname with id
		driver.findElement(By.cssSelector("#input-email")).sendKeys("test@gmail.com");
		
		//tagname with attribute
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test123");
		
		//tagname with classname
		//driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		
		//tagname with class and attribute
		driver.findElement(By.cssSelector("input.btn.btn-primary[type='submit']")).click();
		
		
		//get the warning
		String text=driver.findElement(By.className("alert")).getText();
		System.out.println(text);
		
		

	}

}
