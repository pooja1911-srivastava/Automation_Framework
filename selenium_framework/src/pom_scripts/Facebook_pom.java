package pom_scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import Generics_scripts.Base_Page;

	public class Facebook_pom extends Base_Page 
	{
		@FindBy(id="email")
		private WebElement email;
		@FindBy(id="pass")
		private WebElement password;
		@FindBy(xpath="//button[@type='submit']")
		private WebElement loginbtn;
		
		@FindBy(xpath="//select[@id='day']")
		private WebElement DOBDayDropDwnClick;

		
		
		
		public Facebook_pom(WebDriver driver)
		{
			super(driver);
		}
		public void Email_Id(String email_id)
		{
			email.sendKeys(email_id);
		}
		public void Password(String pwd)
		{
			password.sendKeys(pwd);
		}
		public void Login()
		{
			loginbtn.click();
		}
//		public void DOB_DropDwn()
//		{
//			DOBDropDwn.click();
//		}
	}



