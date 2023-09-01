package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_Facebook {

	public static void main(String[] args) 
	{
		{
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/");
//		  driver.findElement(By.id("email")).sendKeys("abcd");
//		  driver.findElement(By.id("pass")).sendKeys("1234");
//		  //driver.findElement(By.name("login")).click();
//		  driver.findElement(By.linkText("Forgotten password?")).click();
//	      String title = driver.getTitle();
//	      System.out.println(title);
//		  driver.close();
		  
		  //driver.get("file:///C:/Users/Shubham/Desktop/link.html");
		  //driver.findElement(By.linkText("Google")).click();
		  driver.findElement(By.partialLinkText("Forgotten")).click();
		  
//		 driver.get("www.amazon.com");
//		 driver.findElement(By.linkText("Click here to go to amazon.in")).click();
//		  

	}

}
}
