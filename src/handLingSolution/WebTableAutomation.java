package handLingSolution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebTableAutomation {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html");

		System.out.println("**********All Headings for table**********");
		
		List<WebElement> headings=driver.findElements(By.xpath("//thead//tr//th"));
		System.out.println("Total headings are: "+headings.size());
		
		for(WebElement i:headings)
		{
			System.out.println(i.getText());
		}
		
		
		System.out.println("**********Total Rows**********");
		
		int rows=driver.findElements(By.xpath("//tbody//tr")).size();
		System.out.println("Number of rows are: "+rows);
		
		System.out.println("**********Total Columns**********");
		//row--column
		int cells=driver.findElements(By.xpath("//tbody//tr[2]//td")).size();
		System.out.println("Number of columns are: "+cells);
		
		System.out.println("**********Print data for 4th row**********");

		List<WebElement> rowdata=driver.findElements(By.xpath("//tbody//tr[4]//td"));
		
		for(WebElement i: rowdata)
		{
			System.out.print(i.getText()+" ");
		}
		
		System.out.println();
		System.out.println("**********Print data for all firstname**********");

		List<WebElement> fname=driver.findElements(By.xpath("//tbody//tr//td[2]"));
//			WebElement secondrow=driver.findElement(By.xpath("//tbody//tr[2]//td[2]"));
//			System.out.println(secondrow.getText());
			
		
//		for(int i=0;i<fname.size();i++)
//		{
//			if(i==)
//			{
//				System.out.println(fname.get(i).getText());
//			}
//		}
			
		for(WebElement i:fname)
		{
			System.out.println(i.getText());
	
		}
		/*
		int arr[][]=new int[rows][cells];//rows=6
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cells;j++)
			{
			System.out.println(arr[i][j]);
			}
		}
		*/
		
		
		System.out.println("Total data");
		
		List<WebElement> data=driver.findElements(By.xpath("//tbody//tr//td"));
	for(WebElement i:data)
	{
		System.out.println(i.getText());
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	}

}
