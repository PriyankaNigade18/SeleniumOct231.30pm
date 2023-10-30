package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithMethods {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//xpath with text()
		driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]")).click();
		String text1=driver.findElement(By.xpath("//span[@id='zg_banner_text']")).getText();
		System.out.println(text1);
		
		String text2=driver.findElement(By.xpath("(//span[@class='a-carousel-page-count'])[1]")).getText();
		System.out.println(text2);
	
		//xpath with normalize-space()

		driver.findElement(By.xpath("//span[normalize-space()='Cart']")).click();
		
		String text3=driver.findElement(By.xpath("(//h2)[1]")).getText();
		System.out.println(text3);
		
		
		//xpath with contains()
		
		driver.findElement(By.xpath("//input[contains(@id,'searchtex')]")).sendKeys("watch",Keys.ENTER);
		
			
		Thread.sleep(2000);
		//xpath with Starts-with()
		
		WebElement ele=driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]"));
		ele.clear();
		ele.sendKeys("bag",Keys.ENTER);
		
		
		
		
	
	
	
	}

}
