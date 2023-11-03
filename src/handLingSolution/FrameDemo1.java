package handLingSolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//to switch the frame-index
		//driver.switchTo().frame(0);
		
		//switch to the frame using name/id
		//driver.switchTo().frame("mce_0_ifr");
		
		//switch to the frame using webelement
		WebElement frameEle=driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frameEle);
		
		//inside frame
		WebElement ele=driver.findElement(By.tagName("p"));
		ele.clear();
		ele.sendKeys("Swiching to the frame using WebElement");
		
		
		
		
	}

}
