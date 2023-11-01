package handLingSolution;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo1 {

	public static void main(String[] args) throws InterruptedException
	{
			WebDriver driver=new ChromeDriver();
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

			//username
			driver.findElement(By.id("login1")).sendKeys("Priyanka");
			
			//login
			driver.findElement(By.name("proceed")).click();
			Thread.sleep(2000);
			/*
			 * UnhandledAlertException:
			 *  unexpected alert open: 
			 *  {Alert text : Please enter your password}
			 */
			//alert window open
			Alert alt=driver.switchTo().alert();
			System.out.println("Alert text is: "+alt.getText());
			alt.accept();
			
			
			
			
			//password
			driver.findElement(By.id("password")).sendKeys("test123");
			
			
	}

}
