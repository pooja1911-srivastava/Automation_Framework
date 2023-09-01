import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class demoQA {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("pooja");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("saxena");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("pooja@yopmail.com");
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='gender-radio-1']")).click();
		//driver.findElement(By.xpath("//div[@id='close_button']")).click();
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9899079999");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='subjects-auto-complete__input']/input[@id='subjectsInput']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1' and @value=1]")).click();
 }
	
	

}
