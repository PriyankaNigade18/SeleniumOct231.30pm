package testngDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo3 
{
  @Test(priority=1,description="TestCase1")
  public void registrationTest()
  {
	  System.out.println("This is registration test");
  }
  
  @Test(priority=2,description="TestCase2",invocationCount=3)
  public void loginTest()
  {
	  System.out.println("This is Login test");
  }
  
  @Test(priority=3,description="TestCase3")
  public void searchProductTest()
  {
	  System.out.println("This is search test");
  }
  
  @Test(priority=4)
  public void addToCartTest()
  {
	  System.out.println("This is Add To Cart test");
  }
}
