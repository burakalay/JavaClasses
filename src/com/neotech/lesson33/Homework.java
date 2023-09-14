package com.neotech.lesson33;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Homework {
/**
 * Read Homework.xlsx file
Read Companies sheet

1. Read the third row (row index 2) and create an ArrayList of String. Then print the ArrayList.

2. Read the fifth column (col index 4) and create an HashSet of Double. Then print the HashSet.
 * @throws IOException 
 * 
 */
	
	
	public static void main(String[] args) throws IOException {

		String filePath = System.getProperty("user.dir")+"/homework/Homework.xlsx";
		
        System.out.println(filePath);
        
        FileInputStream fis = new FileInputStream(filePath);
        
        Workbook book = new XSSFWorkbook(fis);
        Sheet sheet = book.getSheet("Companies");
        
        Row thirdRow = sheet.getRow(2);
        
        int cells = sheet.getRow(2).getLastCellNum();
        
        List<String> arrlist = new ArrayList<>();
        
        for(int i=0; i<cells; i++) {
        	arrlist.add(thirdRow.getCell(i).toString());
        	
        }
        
        System.out.println(arrlist);
        
        
       System.out.println("----------------------------------------");
       
      Set<Double> hs = new HashSet<>();
      
      
        
        
	}

}
