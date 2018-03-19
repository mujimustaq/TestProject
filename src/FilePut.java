

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilePut {
	public static void main(String[] args) {
		try
		{
		String inputfile = "C:\\Users\\Mujeeba Mohamed Ali\\eclipse-workspace\\TestProject\\Inputfile.xlsx";
	FileInputStream fp = new FileInputStream(inputfile);
	Workbook wb = WorkbookFactory.create(fp);
	Sheet sh = wb.getSheet("Sheet1");
	Cell c = sh.getRow(0).getCell(0);
	String url = c.getStringCellValue();
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mujeeba Mohamed Ali\\Documents\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to(url);
}catch(Exception e)
		{
	
		}
		}
}


