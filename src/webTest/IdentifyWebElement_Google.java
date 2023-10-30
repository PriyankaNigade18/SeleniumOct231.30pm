package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyWebElement_Google {

	public static void main(String[] args) 
	{
		//Create a browser session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("APjFqb")).sendKeys("TestNG");
		
		
		
		/*
		//Strategy1:By+Method
		
		//identify address of element-By is a class
		By searchbox=By.id("APjFqb");
		
		//findout with selenium
		WebElement ele1=driver.findElement(searchbox);
		
		//validate+Actions
		System.out.println("Is Searchbox is displayed?: "+ele1.isDisplayed());
		System.out.println("Is Searchbox is enabled?: "+ele1.isEnabled());
		ele1.sendKeys("Java",Keys.ENTER);
		*/
		
		
		
		
		

	}

}
