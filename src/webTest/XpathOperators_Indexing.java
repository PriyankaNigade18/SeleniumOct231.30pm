package webTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathOperators_Indexing {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

		//first name
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Priyanka");
		
		//last name-xpath with operator
		driver.findElement(By.xpath("//input[@name='lastname' and @class='form-control']")).sendKeys("Nigade");
		
		
		//email
		
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=3]")).sendKeys("test111@gmail.com");
		
		
		
		//telephone
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("979899890");
		
		//password
		driver.findElement(By.xpath("(//input[@class='form-control'])[5]")).sendKeys("test123");
		
		//confirm password
		driver.findElement(By.xpath("(//input[@class='form-control'])[6]")).sendKeys("test123");
		
		
		//radio button-selection validation
//		
//		WebElement yesRadio=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
//		
//		if(!yesRadio.isSelected())//if radio button is not selected then select
//		{
//			yesRadio.click();
//		}
//		
		
		//radio button (yes/no)
		List<WebElement> list1=driver.findElements(By.xpath("(//div[@class='col-sm-10'])[8]//label//input"));
		System.out.println("Total Radion buttons: "+list1.size());
		
		
		for(WebElement i:list1)
		{
			System.out.println("Button text: "+i.getText());
			if(i.isSelected())
			{
				break;
			}else
			{
				System.out.println("Yes Radio button is clicked");
				i.click();
				break;
			}
			
		}
		
		//checkbox
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		//button
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		System.out.println("User Registered!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
