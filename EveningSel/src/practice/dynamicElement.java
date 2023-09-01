package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicElement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bollymoviereviewz.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Mission')]/../../../td[2]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Satya Prem Ki Katha')]/../../../td[3]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'The Trial')]/../../../td[3]")).click();
		driver.findElement(By.xpath("//strong[text()='Baby(Telugu)']/../../../td[4]")).click();
		
		

	}

}
