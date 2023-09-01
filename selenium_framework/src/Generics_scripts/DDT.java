package Generics_scripts;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class DDT
	{
		public static String data(String sheet_name, int Row_index, int Cell_index) throws EncryptedDocumentException, IOException
		{
			FileInputStream fis= new FileInputStream("./Excel/Facebook.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet sheet = book.getSheet(sheet_name);
			Row row = sheet.getRow(Row_index);
			Cell cell = row.getCell(Cell_index);
			String value = cell.toString();
			return value;
			
		}
	}



