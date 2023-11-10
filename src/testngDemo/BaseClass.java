package testngDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	public WebDriver driver;
	

	@BeforeClass
	public void setUp()
	{
		System.out.println("Session created and Browser open with application");
		
		 driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
	}
	
	
	@AfterClass
	  public void tearDown()
	  {
		  driver.quit();
		  System.out.println("Browser closed!");
	  }
	  @BeforeMethod
	  public void getTitle_Url()
	  {
		  System.out.println(" Before Title is: "+driver.getTitle());
		  System.out.println("Before Current url is: "+driver.getCurrentUrl());
	  }
	  
	  @AfterMethod
	  public void getRul_Title()
	  {
		  System.out.println("After Title is: "+driver.getTitle());
		  System.out.println("After Current url is: "+driver.getCurrentUrl());
	  }


}
