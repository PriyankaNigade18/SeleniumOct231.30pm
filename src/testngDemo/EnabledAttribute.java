package testngDemo;

import org.testng.annotations.Test;

public class EnabledAttribute 
{
	/*
	 * To enable or disable test from execution 
	 * 1.enabled=false
	 * 2.using xml file by including and excluding test from execution
	 * 
	 */
  @Test(priority=1)
  public void getLocation()
  {
	  System.out.println("This test get the location");
  }
  @Test(priority=2)
  public void getDepartment()
  {
	  System.out.println("This test get the Department");
  }
  
  @Test(priority=3,enabled=false)
  public void getEmployeeDetails()
  {
	  System.out.println("This test get the employee details");
  }
}
