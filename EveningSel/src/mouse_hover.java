import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_hover {

	public static void main(String[] args) 
	{
      System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//div[text()='Fashion']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		
	}

}
