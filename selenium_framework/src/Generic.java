import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic 
{
public static String ddt(String Sheet,int Row,int Cell) throws EncryptedDocumentException, IOException
{

	FileInputStream fis=new FileInputStream("./excel/book2.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet(Sheet);
	Row row = sheet.getRow(Row);
	Cell cell = row.getCell(Cell);
	String value = cell.toString();
	return value;

}
}
