package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseClass implements ITestListener {

	
	// 20 testcases  > 10 passed ; 10 failed
	
	@Override
	public void onTestStart(ITestResult result) {
		// 20 times
		
		System.out.println("will execute before evety testcase");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		// 10 times
	
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		// 10 times
		//Screenshot related code
		TakesScreenshot tks = (TakesScreenshot) driver;
	  File sourceLocation=	tks.getScreenshotAs(OutputType.FILE);
	  File destinationLocation=new File("c://failedcases//"+ result.getMethod().getMethodName()+".png");
	  try {
		FileUtils.copyFile(sourceLocation, destinationLocation);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		
		// will excute only once for all testcases
		
		System.out.println("will execute first");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
		// will excute only last at the end
		
	}
	
	

}
