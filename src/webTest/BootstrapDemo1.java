package webTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDemo1 {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");

		driver.findElement(By.id("menu1")).click();
		
		//options
		List<WebElement> list1=driver.findElements(By.xpath("(//ul)[1]//li//a"));
		
		for(WebElement i: list1)
		{
			
			System.out.println(i.getText());
			
			
			
		}
		
		
		
		
		
		
	}

}
