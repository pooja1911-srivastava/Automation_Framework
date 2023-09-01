package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class cssSelector {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("abcd");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("1234");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		driver.close();

	}
}

