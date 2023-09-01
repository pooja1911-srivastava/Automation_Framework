import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_scenario {

	public static void main(String[] args) 
	{
	  System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://demoqa.com/frames");
	  
	 // WebElement frame = driver.findElement(By.xpath("frame1"))
	  
	  driver.switchTo().frame("frame1");
	 String text= driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]")).getText();
	  
	  

	}

}
