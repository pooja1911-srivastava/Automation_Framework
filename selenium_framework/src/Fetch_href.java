import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_href {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		FileInputStream fis = new FileInputStream("./excel/Testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.createSheet("Sheet2");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(int i=0; i<links.size();i++)
		{
		Row row = sheet.createRow(i);
		Cell cell = row.createCell(0);
		WebElement ele = links.get(i);
		String att = ele.getAttribute("href");
		cell.setCellValue(att);
		}
		FileOutputStream fio = new FileOutputStream("./excel/Testdata.xlsx");
		book.write(fio);
}
}