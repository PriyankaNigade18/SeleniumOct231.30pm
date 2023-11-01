package generic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility 
{
	
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		      //select class
				Select dd=new Select(ele);
				System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
				
				//all options
				List<WebElement> allOptions=dd.getOptions();
				System.out.println("Total options are: "+allOptions.size());
				
				for(WebElement i:allOptions)
				{
					System.out.println(i.getText());
					if(i.getText().contains(value))
					{
						i.click();
						break;
					}
				}
				
				
	}
	
//Explicit Wait
	public static WebElement presenceOfElement(WebDriver driver,By loc)
	{
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		return w1.until(ExpectedConditions.presenceOfElementLocated(loc));
		
	}

	public static WebElement visibilityOfElement(WebDriver driver,By loc)
	{
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		return w1.until(ExpectedConditions.visibilityOfElementLocated(loc));
		
	}
	
	public static WebElement elementToBeClick(WebDriver driver,By loc)
	{
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		return w1.until(ExpectedConditions.elementToBeClickable(loc));
		
	}
	
	public static boolean verifyTitle(WebDriver driver,String text)
	{
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		return w1.until(ExpectedConditions.titleContains(text));
		
	}
	
	
	public static boolean verifyUrl(WebDriver driver,String text)
	{
		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
		return w1.until(ExpectedConditions.urlContains(text));
		
	}
	
}
