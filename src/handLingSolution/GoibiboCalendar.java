package handLingSolution;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoibiboCalendar {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/flights/");
		//maximize screen
		driver.manage().window().maximize();
		
		//close popup
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		

		//open calendar
		driver.findElement(By.xpath("(//span[contains(@class,'DownArrow')])[1]")).click();
				
				//expected result
				String month="April";
				String year="2024";
				String date="26";
				
				
				//month selection
				while(true)
				{
				String text=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
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
					driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
				}
				
				
				
				}
				
				//date selection
				
				List<WebElement> alldates=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[@class='DayPicker-Day']"));
				
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
