package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListener implements ITestListener {
	
	ExtentReports e;
	ExtentTest t;
	Screenshot s;

	public void onTestStart(ITestResult result) {
		System.out.println("Test case Started");
		t.log(LogStatus.INFO, result.getMethod().getMethodName()+" has started");
	}
	
	  public void onTestSuccess(ITestResult result) {
		    System.out.println("Test case Passed");
		    try {
		    	t.log(LogStatus.PASS, "Screenshot "+t.addScreenCapture(s.takeScreenShot()));
		    }catch(Exception e) {
		    	e.printStackTrace();
		    }
		    
	  }
	
	public void onTestFailure(ITestResult result) {
	    System.out.println("Test case Failed");
	    t.log(LogStatus.FAIL, result.getMethod().getMethodName()+" has failed");
	  }
	
	public void onStart(ITestContext context) {
		s = new Screenshot();
	  System.out.println("TestNG Started");
	  e = new ExtentReports("test-output\\MyReport.html");
	  t=e.startTest("LoginTest Started");
	  e.addSystemInfo("Browser", "Chrome");
	  e.addSystemInfo("Build", "SmokeTesting");
	  }
	
	public void onFinish(ITestContext context) {
	    System.out.println("TestNG Finished");
	    e.endTest(t);
	    e.flush();
	  }
}
