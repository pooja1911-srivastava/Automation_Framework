package method_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> all_links =driver.findElements(By.xpath("//a"));
		int count=all_links.size();
		
		for(int i=0;i<count;i++)
		{
			WebElement we =all_links.get(i);
			   String text =we.getText();
			   System.out.println(text);
		}
		
		for(int i=count-1;i>=0;i--)
		{
			WebElement we =all_links.get(i);
			   String text =we.getText();
			   System.out.println(text);
		}

	}

}
