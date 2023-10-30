package webTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxiesDemo {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		//identify best sellers link from search box
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//following::a[text()='Best Sellers']")).click();
		
		
		
		//identify location text from searchbox
		
		String location=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']//preceding::span[@id='glow-ingress-line1']")).getText();
		
		System.out.println(location);
	}

}
