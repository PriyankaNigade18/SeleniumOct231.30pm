package testngDemo;


import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationDemo
{
  @Test(priority=1)
  public void getOrder()
  {
	  System.out.println("This is get order test case");
  }
  
  @Test(priority=2)
  public void placeOrder()
  {
	  System.out.println("This is place order test case");
  }
  
  @Test(priority=3)
  public void checkoutOrder()
  {
	  System.out.println("This is checkout order test case");
  }
  
  
  //Annotation =rule
  //prerequisite(preconditions=@Before)
  
  @BeforeMethod
  public void bMethod()
  {
	  System.out.println("BeforeMethod executes before every test case");
  }
  
  @AfterMethod
  public void aMethod()
  {
	  System.out.println("AfterMethod executes after every test case");
  }
  
  @BeforeClass
  public void bClass()
  {
	System.out.println("BeforeClass executes before first test case ");  
  }
  
  @AfterClass
  public void aClass()
  {
	  System.out.println("AfterClass executes after last test case");
  }
  @BeforeTest
  public void bTest() {
	  System.out.println("BeforeTest executes before class");
	 
  }
  
  @AfterTest
  public void aTest() {
	  System.out.println("AfterTest executes after class");
	 
  }
  
  @BeforeSuite
  public void bSuite()
  {
	  System.out.println("BeforeSuite executes before test");
  }
  
  @AfterSuite
  public void aSuite()
  {
	  System.out.println("AfterSuite executes After test");
  }
  
}
