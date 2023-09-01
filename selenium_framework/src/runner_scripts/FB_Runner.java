package runner_scripts;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import Generics_scripts.Base_Test;
import Generics_scripts.DDT;
import pom_scripts.Facebook_pom;

	public class FB_Runner extends Base_Test 
	{
		@Test
		public void run() throws InterruptedException, EncryptedDocumentException, IOException
		{
			String email = DDT.data("Sheet1", 1, 0);
			String password = DDT.data("Sheet1", 1, 1);
			Thread.sleep(2000);
			Facebook_pom f=new Facebook_pom(driver);
			Thread.sleep(2000);
			f.Email_Id(email);
			Thread.sleep(2000);
			//wait.until(ExpectedConditions.titleContains("Facebook"));
			f.Password(password);
			Thread.sleep(2000);
			f.Login();
			Thread.sleep(2000);
		}
	}


