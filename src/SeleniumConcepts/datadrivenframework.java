package SeleniumConcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class datadrivenframework {

	
	@Test
	public void readExcelData() throws IOException{
		
		File f = new File("C:\\Users\\WINDOWS 8\\Desktop\\ApachePOI\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);  // .xlsx
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		//HSSFWorkbook hb = new HSSFWorkbook(); // .xls
		
		int numberofRows=sheet.getLastRowNum();
		int numberofColumns=sheet.getRow(0).getLastCellNum();
		
		
		for(int i=0;i<=numberofRows;i++){
			
			for(int j=0;j<numberofColumns;j++){
				String username=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(username);
			}
			
			
			
		/*	String username=sheet.getRow(i).getCell(0).getStringCellValue();
			String password=sheet.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(username);
			System.out.println(password);*/
			
		}
		
		/*XSSFRow row=sheet.getRow(5);
		XSSFCell cell=row.getCell(4);
		String username=cell.getStringCellValue();
		System.out.println("My Name is --- "+username);
		*/
	}
	
	
}
