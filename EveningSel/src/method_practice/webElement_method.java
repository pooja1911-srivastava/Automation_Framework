package method_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElement_method {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println("Title is" + title);
		String currentUrl =driver.getCurrentUrl();
		System.out.println("current_url is" +currentUrl);
//		String page_source =driver.getPageSource();
//		System.out.println("currentPage_source"+page_source);
		driver.navigate().to("https://www.amazon.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();	
//		Dimension d  = new Dimension(200,300);
//		driver.manage().window().setSize(d);
//		Point p = new Point(100,200);
//		driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
		String tag_name =driver.findElement(By.className("nav-action-signin-button")).getTagName();
		System.out.println(tag_name);
		String ele =driver.findElement(By.id("nav-flyout-ya-signin")).getCssValue("font-size");
		System.out.println(ele);
		WebElement ele2 =driver.findElement(By.xpath(""));
		String attribute_value = ele2.getAttribute("class");
		System.out.println("attribute value is "+ attribute_value);
		String Text = ele2.getText();
		System.out.println("text is " +Text);
		Point p = ele2.getLocation();
		int x= p.getX();
		int y =p.getY();
		System.out.println("cordinate X is "+ x);
		System.out.println("cordinate Y is "+ y);
		
		System.out.println("Location is "+ p);
		
		int d = ele2.getSize().getHeight();
		System.out.println("height is "+ d);
		int d2 =ele2.getSize().getWidth();
		System.out.println(d2);
		
		
		
		
	}

}
