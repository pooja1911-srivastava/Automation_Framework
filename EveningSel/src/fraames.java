import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fraames {

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
      WebDriver driver = new FirefoxDriver();
      driver.get("file:///C:/Users/Shubham/Desktop/mainPage.html");
      driver.findElement(By.xpath("//input[@id='a1']")).sendKeys("qspider");
      WebElement frame = driver.findElement(By.tagName("iframe"));
      
      driver.switchTo().frame(frame);
      
      Thread.sleep(3000);
      
      driver.findElement(By.xpath("//input[@id='p1']")).sendKeys("rajajiNagar");
      
      

	}

}
