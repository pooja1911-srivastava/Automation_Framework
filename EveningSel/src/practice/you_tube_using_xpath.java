package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class you_tube_using_xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kgf");
		
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='K.G.F Full Movie | Yash, Srinidhi Shetty, Ananth Nag, Ramachandra Raju, Achyuth Kumar, Malavika']")).click();
		
		
		
	}

}
