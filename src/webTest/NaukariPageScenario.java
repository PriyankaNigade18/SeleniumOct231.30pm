package webTest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariPageScenario {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/companies-hiring-in-india?src=gnbCompanies_homepage_srch");

		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total Links on the page: "+allLinks.size());
		
		String exp="https://www.naukri.com/fresher-jobs?src=gnbjobs_homepage_srch";
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getAttribute("href"));
			try {
			if(i.getAttribute("href").contains(exp))
			{
				System.out.println("Match Found....Test Pass!");
				break;
			}}
			catch(Exception e)
			{
			System.out.println("No href attribute for link");	
			}
		}
		
		
		
		
		
		
		
	}

}
