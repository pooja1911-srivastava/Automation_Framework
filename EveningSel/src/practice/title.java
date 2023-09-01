package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class title {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Amazon.com."))
		//if(title.equals("Amazon.com. Spend less. Smile more."))
       {
        	System.out.println("test case passed");
        }
        else
        {
        	System.out.println("test case failed");
        }
	
	    
//another using partailly Dynamic
	driver.get("https://accounts.google.com/v3/signin");
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("itm.pooja.ei@gmail.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='Xb9hP']/input[@name='password']")).sendKeys("Tinapooja@1a");
	
	
//	String cureentURL = driver.getCurrentUrl();
//	if(cureentURL.equals("https://www.amazon.com/"))
//	{
//		System.out.println("test case passed");
//	}
//	else
//	{
//		System.out.println("test case failed");
//	}
//	
//	 driver.get("https://www.facebook.com/");
//	 String currentUrl = driver.getCurrentUrl();
//	 if(currentUrl.contains(currentUrl))
//	 {
//		 System.out.println("test case passed");
//	 }
//	 else
//	 {
//		 System.out.println("test case failed");
//	 }
}
	
}

