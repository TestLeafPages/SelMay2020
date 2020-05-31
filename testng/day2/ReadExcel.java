package testng.day2;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {
		
		//xlsx format
		// xml spreadsheet format
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+fileName+".xlsx"); 
		
		// method used to pass sheet name
		//wb.getSheet("Sheet1");
		
		//method to pass the index
		XSSFSheet ws = wb.getSheetAt(0);
		
		int rowsCount = ws.getLastRowNum();
		
		// int rowsCount = ws.getPhysicalNumberOfRows();
		
	//	System.out.println(rowsCount);
		
		int cellCount = ws.getRow(0).getLastCellNum();
		
	//	System.out.println(cellCount);
		
		String[][] data = new String[rowsCount][cellCount];
		
		
		
		  for (int i = 1; i <= rowsCount; i++) {
		  
			for (int j = 0; j < cellCount; j++) {
		  
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
		  
				// 0,0
				data[i - 1][j] = cellValue;
		  
		 // System.out.println(cellValue);
		  
		  
		  }
		  
		  
		  
	}
		  
		 
		
		/*
		 * XSSFRow row = ws.getRow(0);
		 * 
		 * XSSFCell cell = row.getCell(0);
		 * 
		 * String cellValue = cell.getStringCellValue();
		 * 
		 * System.out.println(cellValue);
		 */
		/*
		 * // xls format HSSFWorkbook wb = new HSSFWorkbook(); Horrible spreadsheet format
		 */
		
		
		wb.close();
		
		
		return data;

	}

}
