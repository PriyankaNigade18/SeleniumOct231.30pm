package handLingSolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameDemo {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		
		
		//top--->left
		driver.switchTo().frame(0).switchTo().frame("frame-left");
		//driver.switchTo().frame("frame-left");
		
		String text1=driver.findElement(By.xpath("//body[normalize-space()='LEFT']")).getText();
		
		System.out.println("Left frame text is: "+text1);
		
		System.out.println("********************");
		//come back to top frame
		driver.switchTo().defaultContent();
		
		//NoSuchFrameException: 
		//No frame element found by name or id frame-middle
		//top ---middle
		driver.switchTo().frame(0).switchTo().frame("frame-middle");
		System.out.println(driver.getPageSource());
		
		System.out.println("****************************");
		
		//comeback to top
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0).switchTo().frame("frame-right");
		
		String text2=driver.findElement(By.xpath("//body[normalize-space()='RIGHT']")).getText();
		
		System.out.println(text2);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		System.out.println(driver.getPageSource());
		
		
		
		
		

	}

}
