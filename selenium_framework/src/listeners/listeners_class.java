package listeners;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners_class implements ITestListener
{

	@Override
	public void onTestFailure(ITestResult result) 
	{
		
		System.out.println("TC failed to execute");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Skipped Test");
	}

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("TC starts");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TC success executed");
	}

	
	

}
