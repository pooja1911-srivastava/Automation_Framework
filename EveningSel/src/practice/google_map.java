package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_map {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps");
		driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='sb_ifc50']/input")).sendKeys("bangalore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='sb_ifc51']/input")).sendKeys("delhi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@data-tooltip='Search'])[2]")).click();
		//Thread.sleep(2000);
		//driver.close();

	}

}
