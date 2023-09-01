package reporting_tool;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class reporting 
{
@Test
public void test1()
{
	ExtentReports report = new ExtentReports("./reports/r.html",false);
	ExtentTest log1=report.startTest("tc1");
	log1.log(LogStatus.PASS, "tc passed");
	log1.log(LogStatus.FAIL,"tc failed");
	log1.log(LogStatus.SKIP,"tc skipped");
	report.flush();
	
}
}
