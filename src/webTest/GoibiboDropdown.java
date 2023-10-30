package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboDropdown {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/flights/");
		//maximize screen
		driver.manage().window().maximize();
		
		//close popup
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		
		//from
		driver.findElement(By.xpath("(//p[text()='Enter city or airport'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("p");
		
		
		//list
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']//li//span[@class='autoCompleteTitle ']"));
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Pantnagar, India"))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
