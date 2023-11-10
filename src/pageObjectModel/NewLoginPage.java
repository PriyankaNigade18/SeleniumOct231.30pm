package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewLoginPage 
{
	//PageFactory class 
	
	private WebDriver driver;
	
	public NewLoginPage(WebDriver driver)//base class driver
	{
		this.driver=driver;
		
	}
	
	//Locators- @FindBy
	
	@FindBy(name="username")
	WebElement un;
	
	@FindBy(name="password")
	WebElement psw;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement button;
	
	//Methods(Action)
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
	un.sendKeys(usern);
	psw.sendKeys(pass);
	button.click();
	}
	
	
	
	
	

}
