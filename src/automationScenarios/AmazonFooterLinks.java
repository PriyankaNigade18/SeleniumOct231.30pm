package automationScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AmazonFooterLinks {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		List<WebElement> list1=driver.findElements(By.xpath("(//div[contains(@class,'navFooterLink')]//ul)[1]/li//a"));
	
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
		}
		
		
		
		
	}

}
