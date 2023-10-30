package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTest {

	public static void main(String[] args)
	{
		//headless
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(options);
		System.out.println("Log: Driver session is created!");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		System.out.println("Log: Google application open!");

		driver.findElement(By.name("q")).sendKeys("Java");
		
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		
		System.out.println("Total Options are: "+list1.size());
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
		}
		
		
		

	}

}
