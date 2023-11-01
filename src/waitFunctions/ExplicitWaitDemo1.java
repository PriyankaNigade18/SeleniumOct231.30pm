package waitFunctions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo1 
{
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
	
	
	
	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		boolean status=verifyUrl(driver,"ninja");
		System.out.println("Url contains ninja: "+status);
		
		boolean titleStatus=verifyTitle(driver,"Login");
		System.out.println("Title contains Login: "+titleStatus);
		
		
		
		//WebDriverWait(c)extends FlueintWait(c) implements Wait(I)
		
		//By locator
		By email=By.id("input-email");
		By password=By.name("password");
		By button=By.xpath("//input[@value='Login']");
		/*
		 * TimeoutException: Expected condition failed:
		 *  waiting for presence of element located by: By.id: input-email###
		 *  (tried for 10 second(s) with 500 milliseconds interval)
		 *  
		 *  Selenium default interval time(Polling time)= 500ms =0.5 sec
		 */
		//Explicit Wait---WebDriverWait class
//		WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));
//		w1.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys("test@gmail.com");
		
		WebElement ele1=presenceOfElement(driver,email);
		ele1.sendKeys("test12@gmail.com");
		
		//password
		 visibilityOfElement(driver,password).sendKeys("test123");
			
//		WebDriverWait w2=new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement ele2=w2.until(ExpectedConditions.visibilityOfElementLocated(password));
//		
//		ele2.sendKeys("test123");
		
		 //login
		 elementToBeClick(driver,button).click();
		 
		
		
		
		
		
		
		
		
		
		

	}

}
