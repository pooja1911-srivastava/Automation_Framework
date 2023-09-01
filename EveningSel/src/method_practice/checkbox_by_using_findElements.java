package method_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox_by_using_findElements {

		public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/Shubham/Desktop/checkbox.html");
			List<WebElement> cBox =driver.findElements(By.xpath("//input"));
			int count=cBox.size();
			System.out.println(count);
			
//			for(int i=0;i<count;i++)
//			{
//				WebElement we =cBox.get(i);
//				 we.click();
//				   
//			}
//			for(int i=count-1;i>=0;i--)
//			{
//				WebElement we =cBox.get(i);
//				we.click();
//			}
			//for-each
			for(WebElement we : cBox)
			{
				we.click();
				
				
				
			}

		}

	

	}


