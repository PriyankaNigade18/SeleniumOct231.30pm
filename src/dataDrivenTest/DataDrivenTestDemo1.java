package dataDrivenTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTestDemo1
{
	/*
	 * Data driven test means execute same set of action with multiple test data multiple time
	 * 
	 */
//	@DataProvider(name="TestData")
//	public Object[][] testData()
//	{
//		Object data[][]= {{"Admin","admin123"},{"Smita","test123"},{"Admin","admin123"}};
//		return data;
//	}
	
  @Test(dataProvider="TestData",dataProviderClass = CustomData.class)
  public void loginTest(String un,String psw)
  {
//	  System.out.println("User name is: "+un);
//	  System.out.println("Password is: "+psw);
	  
	  WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		//username
		driver.findElement(By.name("username")).sendKeys(un);
			
		//password
	   driver.findElement(By.name("password")).sendKeys(psw);
		
		
		driver.findElement(By.className("oxd-button")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail");
		System.out.println("Login Completed!");
  }
}
