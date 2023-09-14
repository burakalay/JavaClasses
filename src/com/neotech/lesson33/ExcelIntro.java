package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIntro {

	public static void main(String[] args) throws IOException {

		//where is the file located?
		
		String filePath=System.getProperty("user.dir") + "/test_date/Test.xlsx";
		
		System.out.println(filePath);
                    
		FileInputStream fis = new FileInputStream(filePath);
		
		// we need to read the workbook/ excel file
		
		Workbook book = new XSSFWorkbook(filePath);
		
		//Access the sheet that you want
		
		Sheet testData =  book.getSheet(filePath);
		
		Row firstRow = testData.getRow(0);
		
		//Access a certain cell in this row
		
		Cell cell = firstRow.getCell(1);
		
		//lets get the date from cell
		
		String info = cell.toString();
		System.out.println(info);
		
        //how do i get NY?
		
		Row rowNY = testData.getRow(2);
		Cell cellNY = rowNY.getCell(3);
		
		String cellValue = cellNY.toString();
		System.out.println(cellValue);
		
		//get garfield using method chaining
		
		String cellValue2 = testData.getRow(1).getCell(2).toString();
		System.out.println(cellValue2);
		
		//get a numeric value within the cell
		
		double cellDoubleValue = testData.getRow(1).getCell(4).getNumericCellValue();
		
		System.out.println(cellDoubleValue);
		// downcasting into int
		int intValue = (int) cellDoubleValue;
		System.out.println(intValue);
		
		
	}

}
