package method_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetch_href_value_in_amazon {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> links =driver.findElements(By.xpath("//a"));
		int count = links.size();
		System.out.println(count);
		for (WebElement webElement : links) 
		{
			String attribute = webElement.getAttribute("href");
			System.out.println(attribute);
			
		}
		
		

	}

}
