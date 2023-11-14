package testngDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import generic.PropertiesUtil;

public class CRMPropertiesDemo {
  @Test
  public void loginTest()
  {
	  PropertiesUtil p1=new PropertiesUtil();
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get(p1.getData("curl"));
	  
	  
	  driver.findElement(By.id("email-id")).sendKeys(p1.getData("email"));
	  driver.findElement(By.id("password")).sendKeys(p1.getData("pass"));
	  driver.findElement(By.id("submit-id")).click();
  }
}
