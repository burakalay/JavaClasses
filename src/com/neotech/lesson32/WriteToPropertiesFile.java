package com.neotech.lesson32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {

	public static void main(String[] args) throws IOException {

		String filePath ="C:\\Users\\Burak\\eclipse-workspace\\myFirstProgram\\configs\\example.properties";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		
		prop.load(fis);

		prop.setProperty("state", "Turkiye");
		
		//adding a new property
		prop.setProperty("phoneNumber", "1234567890");
		
	    //to write to the file, we need to use fileoutputstream

		FileOutputStream fos = new FileOutputStream(filePath);
		
		prop.store(fos, filePath);
		
		
		
		
	}

}
