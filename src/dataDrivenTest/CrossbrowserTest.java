package dataDrivenTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossbrowserTest
{
	public WebDriver driver;
	@Parameters({"bname"})
  @Test
  public void browerSetup(String bname)
  {
	  if(bname.equalsIgnoreCase("chrome"))
	  {
		  driver=new ChromeDriver();
		  
	  }else if(bname.equalsIgnoreCase("firefox"))
	  {
		  driver=new FirefoxDriver();
	  
		  
	  }else if(bname.equalsIgnoreCase("edge"))
	  {
		  driver=new EdgeDriver();
		  
	  }
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in");
	  
  }
}
