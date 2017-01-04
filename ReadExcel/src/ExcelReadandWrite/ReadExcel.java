package ExcelReadandWrite;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		File src = new File("B:\\Docs\\Saibersys\\5211_weekly_Status.xlsx");
		FileInputStream f = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(f); //imports the apache class for excel
		XSSFSheet sht1 = wb.getSheetAt(0); //import which sheet
		String data0 = sht1.getRow(0).getCell(1).getStringCellValue(); //import the rows and cols
		System.out.println("Data in the Excel sheet is --> "+data0);
		wb.close(); //prevent memory leak
		
		int rowcount = sht1.getLastRowNum(); //no. of rows
		System.out.println("Total no. of rows are "+rowcount);
		for(int i=0;i<=rowcount;i++)
		{
			String d1=sht1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("Data from Excel sheet --> "+d1);
		}

	}

}
