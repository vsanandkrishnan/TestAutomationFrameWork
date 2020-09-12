package global.data.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderConfig {
	
	public static File fin;
	public static FileInputStream fis;
	public static XSSFWorkbook web;
	public static XSSFSheet sh;

	public static XSSFRow row;
	public static XSSFCell cell;

	public static ArrayList data;

	public ExcelReaderConfig(String excelPath, String sheetName) {

		try {
			fin = new File(excelPath);

			fis = new FileInputStream(fin);

			web = new XSSFWorkbook(fis);

			sh = web.getSheet(sheetName);
			data = new ArrayList();
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}

	}

	public String getData(int row, int column) {

		String data = sh.getRow(row).getCell(column).getStringCellValue();
		System.out.println("The data is= " + data);
		return data;
	}

	public String getDataNew(String locator) {
        String locatorValue= null;
		Iterator rowIterator = sh.rowIterator();

		while (rowIterator.hasNext()) {

			row = (XSSFRow) rowIterator.next();
			Iterator cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				cell = (XSSFCell) cellIterator.next();
				switch (cell.getCellType()) {
				case STRING:
					data.add(cell.getStringCellValue());
					break;
				case NUMERIC:
					data.add(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					data.add(cell.getBooleanCellValue());

				}

			}

		}
	    for(int j=0;j<data.size()-1;j++) {
	    	String locatorName = (String)data.get(j);
	    	
	    	if(locatorName.equals(locator)) {
//	    	System.out.print(data.get(j));
//	    	System.out.print(" ");
	    	locatorValue =(String)data.get(j+1);
//	    	System.out.print(data.get(j+1));
//	    	System.out.println();
	    	
	    	}
	    	
	    	j++;
	    	
	    }
	    
	    return locatorValue;
		
	}

}


