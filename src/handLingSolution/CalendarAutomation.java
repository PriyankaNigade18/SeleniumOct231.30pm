package handLingSolution;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarAutomation {

	public static void main(String[] args) 
	{
		//disable notification
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		
		//open calendar
		driver.findElement(By.xpath("//span[text()='Date']")).click();
		
		//expected result
		String month="Apr";
		String year="2024";
		String date="26";
		
		
		//month selection
		while(true)
		{
		String text=driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator__Icon')])[2]")).getText();
		//System.out.println(text);
		String c_month=text.split(" ")[0];
		String c_year=text.split(" ")[1];
		
		//System.out.println(c_month+"  "+c_year);
		
		if(c_month.contains(month) && c_year.contains(year))
		{
			break;
		}else
		{
			//click on arrow
			driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator__Icon')])[3]")).click();
		}
		
		
		
		}
		
		//date selection
		
		List<WebElement> alldates=driver.findElements(By.xpath("//div[contains(@class,'DayTiles__CalendarDays')]//span"));
		
		for(WebElement i:alldates)
		{
			if(i.getText().contains(date))
			{
				i.click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
