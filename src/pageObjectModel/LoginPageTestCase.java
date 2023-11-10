package pageObjectModel;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginPageTestCase extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl()
  {
	  //LoginPage lp=new LoginPage();
	  String cUrl=lp.getAppUrl();
	  Assert.assertTrue(cUrl.contains("login"),"URL is not match");
	  System.out.println("Url is match: "+cUrl);
  }
  
  @Test(priority=2)
  public void verifyTitle()
  {
	  String title=lp.getAppTitle();
	  Assert.assertTrue(title.equals("OrangeHRM"),"Title is not match");
	  System.out.println("Title is match: "+title);
  }
  
  
  @Test(priority=3)
  public void verifyLogin()
  {
	  lp.doLogin("Admin","admin123");
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login fail");
	  System.out.println("Login Completed!");
	  
  }
}
