package testngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo 
{
  @Test
  public void hardAssertion() 
  {
	  /*
	   * Hard Assertion stop execution on same line when assertion get fail
	   */
	  String act="Selenium WebDriver is WebUI automation library.";
	  String exp="Selenium WebDriver is WebUI automation library.";
	  
	  //Hard Assert--->Assert class--->contains static method
	  //Assert.assertEquals(act,exp,"Assert Fail: Strings are not equal!");
	  
	  //Assert.assertTrue(act.contains("testNG"),"Assert Fail: Actual String not contains testNg!");
	  
	  Assert.assertFalse(act.contains("testNG"),"Assert Fail: Actual string contains testNg!");
	  System.out.println("Assert pass: Actual String does not contains testNG!");
	  System.out.println("Program completed!");
	  
 }
  
  @Test
  public void softAssertion()
  {
	 
	  int a=100,b=100;
	  SoftAssert sf=new SoftAssert();
	  //sf.assertEquals(a,b,"Assert Fail: Value of a and b are not equals!");
	  sf.assertFalse(a==b,"Assert Fail: Value of a and b are equals!");
	  System.out.println("Assert Pass: Value of a and b are not equals!");
	  sf.assertAll();
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
