import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class kannad {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement kannnad = driver.findElement(By.xpath("//a[text()='മലയാളം']"));
		
		Actions act = new Actions(driver);
		act.contextClick(kannnad).perform();
		Thread.sleep(2000);
		Robot r  = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		
		
		
		

	}

}
