package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_FB_using_xpath {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("1234");
	        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd");
	        driver.findElement(By.xpath("//button[@name='login']")).click();

	}

}
