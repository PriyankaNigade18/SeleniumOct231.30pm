package testngDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationRealScenario extends BaseClass
{
	//WebDriver driver;
	
  @Test(priority=1)
  public void loginTest()
  {
 driver.findElement(By.name("username")).sendKeys("Admin");
  driver.findElement(By.name("password")).sendKeys("admin123");
  driver.findElement(By.xpath("//button[@type='submit']")).click();
  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail");
  System.out.println("Login Completed!");
  }
  
  
  @Test(priority=2)
  public void logoutTest()
  {
	  driver.findElement(By.xpath("//i[contains(@class,'oxd-userdropdown-icon')]")).click();
	  driver.findElement(By.linkText("Logout")).click();
	 
  System.out.println("User logout is completed!");
  }
  
  
  
}
