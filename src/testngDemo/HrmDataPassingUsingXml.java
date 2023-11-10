package testngDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HrmDataPassingUsingXml
{
	@Parameters({"un","psw"})
  @Test
  public void hrmLogin(String un,String psw)
  {
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
