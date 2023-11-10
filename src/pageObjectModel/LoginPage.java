package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	
	
	/*
	 * Encapsulation=Identification of WebElement+Actions on WebElement
	 */
	
	private WebDriver driver;
	
	//Initialize driver
	public LoginPage(WebDriver driver)//driver from base class
	{
		this.driver=driver;
	}
	
	
	
	
	
	//By locator
	private By un=By.name("username");
	private By psw=By.name("password");
	private By loginBtn=By.xpath("//button[@type='submit']");
	
	//method
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public void doLogin(String usern,String pass)
	{
		driver.findElement(un).sendKeys(usern);
		driver.findElement(psw).sendKeys(pass);
		driver.findElement(loginBtn).click();
	}
	
	
	

}
