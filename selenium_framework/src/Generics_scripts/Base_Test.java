package Generics_scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Framework_constant1
{
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty(gecko_key,gecko_value);
		 driver =new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get(base_url);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeAppln() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
}
