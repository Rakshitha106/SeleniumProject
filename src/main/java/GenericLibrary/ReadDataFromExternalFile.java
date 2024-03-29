package GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;



public class ReadDataFromExternalFile {
	
	public String readinputDataFromPropertyFile(String path,String key) throws IOException {
		File file=new File("./TestData/PropertyData.properties.txt");
		FileInputStream fis = new FileInputStream(file);
		
		Properties pro = new Properties();
		pro.load(fis);
		
		String value = pro.getProperty(key);
		
		return value;
		
	}

	public String readingTheDataFromExcelSheet(String path, String sheetName,int rownum,int cellnum) throws Throwable {
		File file=new File("./TestData/AdvanceSeleniumTestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetName);
		
		String data = book.getSheet(sheetName).getRow(rownum).getCell(cellnum).toString();
	
		return data;
		
	}
	public static String[][] readDataFromMultipleRowColumn(String path,String sheetName,int rownum,int cellnum) throws Throwable, IOException{
	File file=new File("./TestData/AdvanceSeleniumTestData.xlsx");
	
	FileInputStream fis=new FileInputStream(file);
	
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet(sheetName);

	int numOfRows = workbook.getSheet("regData").getPhysicalNumberOfRows();
	int numOfCells = workbook.getSheet("regData").getRow(0).getPhysicalNumberOfCells();
	
	String[][] data=new String[numOfRows][numOfCells];
	for (int i = 0; i < numOfRows; i++) {
		for (int j = 0; j < numOfCells; j++) {
			
			String dataFromCell=sheet.getRow(i).getCell(j).toString();
			data[i][j]=dataFromCell;
		}
		}
		
	return data;

}
	
	public String[] readRowDataFromExcel(String path,String sheetName,int cellnum) throws Throwable, IOException{
		File file=new File("./TestData/AdvanceSeleniumTestData.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet(sheetName);

		int numOfRows = workbook.getSheet("regData").getPhysicalNumberOfRows();
	//	int numOfCells = workbook.getSheet("regData").getRow(0).getPhysicalNumberOfCells();
		
		String[] data=new String[numOfRows];
		for (int i = 0; i < numOfRows; i++) {
				String dataFromCell=sheet.getRow(i).getCell(cellnum).toString();
				data[i]=dataFromCell;
			}
		
			
		return data;

	}
}
