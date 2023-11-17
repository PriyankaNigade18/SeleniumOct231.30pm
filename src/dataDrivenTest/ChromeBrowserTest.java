package dataDrivenTest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeBrowserTest {
  @Test
  public void chromeTest() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  System.out.println("Title is: "+driver.getTitle());
  }
}
