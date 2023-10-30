package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus_Dropdown {

	public static void main(String[] args) {

		//disable notification
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		
		//from dropdwon
		driver.findElement(By.id("src")).sendKeys("Pune");
		
		//list
		
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//li//div//text[@class='placeHolderMainText']"));
		System.out.println("Total Available options are: "+list1.size());
		
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
			
			if(i.getText().contains("Viman Nagar"))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		

	}

}
