package testngDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HrmpropertiesFile {
  @Test
  public void readData() throws IOException 
  {
	  File f1=new File(System.getProperty("user.dir")+"\\Config.properties");
	  FileInputStream fs=new FileInputStream(f1);
	  
	  Properties p1=new Properties();
	  p1.load(fs);
	  
	  System.out.println("Url is: "+p1.getProperty("url"));
	  System.out.println("User name is: "+p1.getProperty("un"));
	  System.out.println("password is: "+p1.getProperty("psw"));
	  
	  WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p1.getProperty("url"));
		
		
		//username
		driver.findElement(By.name("username")).sendKeys(p1.getProperty("un"));
			
		//password
	   driver.findElement(By.name("password")).sendKeys(p1.getProperty("psw"));
		
		
		driver.findElement(By.className("oxd-button")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail");
		System.out.println("Login Completed!");
		
	  
	  
	  
	  
	  
  }
}
