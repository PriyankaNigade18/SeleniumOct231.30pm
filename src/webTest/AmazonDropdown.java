package webTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import generic.Utility;

public class AmazonDropdown {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		
		//dropdown ele
		WebElement ddele=driver.findElement(By.name("url"));
		
		Utility.selectBasedDropdown(ddele,"Gift Cards");
		
		
		
		
		
		/*
		//Select class
		Select sc=new Select(ddele);
		
		System.out.println("Is dropdown support multiple selection?: "+sc.isMultiple());
		
		//single value
		sc.selectByIndex(3);//amazon Fashion
		Thread.sleep(2000);
		
		sc.selectByValue("search-alias=mobile-apps");//Apps & Games
		Thread.sleep(2000);
		sc.selectByVisibleText("Gift Cards");
		
		//get all options
		List<WebElement> list1=sc.getOptions();
		System.out.println("Total options are: "+list1.size());
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
			if(i.getText().contains("Toys & Games"))
			{
				i.click();
				break;
			}
		}
		
		
		*/
		
		
		
		
		
		
		
		

	}

}
