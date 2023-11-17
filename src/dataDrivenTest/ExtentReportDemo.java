package dataDrivenTest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo 
{
  @Test
  public void reportTest()
  {
	  //create object of ExtentReports class
	  ExtentReports extents=new ExtentReports();
	  
	  //reporter
	  ExtentSparkReporter spark=new ExtentSparkReporter("./"+"\\Reports\\AutomationTest.html");
	  
	 
	  
	  spark.config().setDocumentTitle("Automation Test Report");
	  spark.config().setReportName("Sprint1 Report");
	  spark.config().setTheme(Theme.DARK);
	  
	  //attach report
	  extents.attachReporter(spark);
	  
	  //create test
	  ExtentTest test=extents.createTest("SampleTest");
	  
	  test.pass("Test is pass!");
	  test.fail("Test is Fail!");
	  test.log(Status.PASS,"This test is pass");
	  
	  //exit the report
	  extents.flush();
	  
	  
	  
	  
	  
  }
}
