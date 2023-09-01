package method_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetch_src_value_in_flipkart {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.manage().window().maximize();
		List<WebElement> src =driver.findElements(By.xpath("//img"));
		int count = src.size();
		System.out.println(count);
		
		for (WebElement webElement : src) 
		{
			String attribute =webElement.getAttribute("src");
			System.out.println(attribute);
			
			
			
		}
		
	}

}
