package pageObjectModel;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewLoginPageTestCase extends BaseClass
{
  @Test(priority=1)
  public void verifyUrl()
  {
	  //NewLoginPage np=PageFactory.initElements(driver,NewLoginPage.class);
	  String url=np.getAppUrl();
	  Assert.assertTrue(url.contains("login"),"Url is not match");
	  System.out.println("Url is match: "+url);
  }
  
  @Test(priority=2)
  public void verifyTitle()
  {
	  System.out.println("Title is: "+np.getAppTitle());
  }
  
  
  @Test(priority=3)
  public void verifyLogin()
  {
	  np.doLogin("Admin","admin123");
	  System.out.println("Login Completed!");
  }
}
