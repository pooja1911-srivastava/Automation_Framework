package Generics_scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_select 
{
	WebDriver driver;
	
	public Generic_select(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Dropdwn(WebElement ele)
	{
		Select s = new Select(ele);
		s.selectByIndex(0);

	}
	
}
