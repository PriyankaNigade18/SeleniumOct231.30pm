package handLingSolution;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTypesDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		//alert1
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(2000);
		Alert alt1=driver.switchTo().alert();
		System.out.println("Alert text is: "+alt1.getText());
		alt1.accept();
		
		//result text
		String result1=driver.findElement(By.id("result")).getText();
		System.out.println("Result for alert1 : "+result1);
		
		//alert2
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		Alert alt2=driver.switchTo().alert();
		System.out.println("Alert text is: "+alt2.getText());
		alt2.dismiss();
		String result2=driver.findElement(By.id("result")).getText();
		System.out.println("Result for alert2 : "+result2);
		
		
		
	}

}
