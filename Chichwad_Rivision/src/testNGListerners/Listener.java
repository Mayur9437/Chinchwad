package testNGListerners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("TC is "+result.getName()+" Started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("TC "+result.getName()+" Success");
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("TC "+result.getName()+" Failed");
	}
}
