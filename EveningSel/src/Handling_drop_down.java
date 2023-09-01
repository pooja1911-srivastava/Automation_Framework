import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_drop_down {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Shubham/Desktop/drop_down.html");
		Thread.sleep(2000);
		
          WebElement ele = driver.findElement(By.id("countries"));
          Select s = new Select(ele);
          s.selectByIndex(0);
          Thread.sleep(2000);
          s.selectByIndex(1);
          Thread.sleep(2000);
          s.selectByIndex(2);
          Thread.sleep(2000);
          s.selectByIndex(8);
         // s.deselectAll();
         List<WebElement> options = s.getOptions();
         int count = options.size();
         System.out.println(count);
         
         for(WebElement wb:options)
         {
        	 System.out.println(wb.getText());
         }
         

	}

}
