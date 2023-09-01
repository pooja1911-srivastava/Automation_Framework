package handling_drop_down;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_drop_down {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		WebElement ele=driver.findElement(By.xpath("//select[@id='day']"));
		Select s= new Select(ele);
		Boolean b =s.isMultiple();
		if(b)
		{
			System.out.println("multi-select");
		}
		else
		{
			System.out.println("not");
		}
		List<WebElement> opt = s.getOptions();
		int count = opt.size();
		System.out.println(count);
		for(WebElement wb:opt)
		{
		   System.out.println(wb.getText());
		}

	}

}
