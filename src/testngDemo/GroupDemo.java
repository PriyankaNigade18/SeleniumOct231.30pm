package testngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class GroupDemo
{
	@Test(priority=1,groups="smokeTest")
	  public void urlTest()
	  {
		  System.out.println("This is Application launch test");
	  }
	
  @Test(priority=2,groups="FunctionalTest")
  public void registrationProcess()
  {
	  System.out.println("This is registratation test");
  }
  
  @Test(priority=3,groups="FunctionalTest")
  public void loginProcess()
  {
	  System.out.println("This is login test");
  }
  
  @Test(priority=4,groups="RegressionTest")
  public void searchProcess()
  {
	  System.out.println("This is search test");
  }
  
  
}
